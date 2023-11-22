OFFSET = 100
MAX_R = 200

# n 개의 사각형
n = int(input())

# 200 * 200 짜리 공간
checked = [
    [0] * (MAX_R + 1)
    for _ in range(MAX_R + 1)
]

for i in range(n) :
    # input 좌표 받아오기
    x1, y1, x2, y2 = tuple(map(int, input().split()))
    x1, y1, x2, y2 = x1 + OFFSET, y1 + OFFSET, x2 + OFFSET, y2 + OFFSET
    
    # 짝수면 빨간색 = 1
    if i % 2 == 0 :
        for x in range(x1, x2) :
            for y in range(y1, y2) :
                checked[x][y] = 1
    # 홀수면 파란색 = 2
    if i % 2 != 0 :
        for x in range(x1, x2) :
            for y in range(y1, y2) :
                checked[x][y] = 2

area = 0
# 전체 공간 순회
for x in range(MAX_R + 1) :
    for y in range(MAX_R + 1) :
        # 파란색인 공간 체크
        if checked[x][y] == 2 :
            area +=1

print(area)