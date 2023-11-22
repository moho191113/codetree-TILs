OFFSET = 100
MAX_R = 200

n = int(input())
rects = [
  tuple(map(int, input().split()))
  for _ in range(n)
]

checked = [
  [0] * (MAX_R + 1)
  for _ in range(MAX_R + 1)
]
 
for x1, y1 in rects :
  x2, y2 = x1 + 8, y1 + 8

  x1, y1 = x1 + OFFSET, y1 + OFFSET
  x2, y2 = x2 + OFFSET, y2 + OFFSET

  for x in range(x1, x2) :
    for y in range(y1, y2) :
      checked[x][y] = 1

cnt = 0

for i in range(0, MAX_R + 1) :
  for j in range(0, MAX_R + 1) :
    if checked[i][j] :
      cnt += 1

print(cnt)