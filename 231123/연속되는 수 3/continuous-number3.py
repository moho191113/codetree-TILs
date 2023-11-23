# n개의 데이터
n = int(input())

# n개의 데이터 저장
array = [
  int(input())
  for _ in range(n)
]

# 음수양수 판별
def ne_po_dis(num) :
  if num > 0 :
    return 1
  else :
    return 0

# 연속수열 기록
ans, cnt = 0, 0

for i in range(n) :
  # 이전값이 똑같은 음수면 + 1
  if i >= 1 and ne_po_dis(array[i]) == ne_po_dis(array[i - 1]) :
    cnt += 1
  # 아니면 1로 초기화
  else :
    cnt = 1
  # 최대 연속수열 기록
  ans = max(ans, cnt)

print(ans)