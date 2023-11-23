# n개의 데이터 받기
n = int(input())

# array에 데이터 받기
array = [
  int(input())
  for _ in range(n)
]

# 최대 연속수열 저장
ans, cnt = 0, 0

for i in range(n) :
  # 연속수열이면 cnt + 1
  if i >= 1 and array[i] > array[i - 1] : 
    cnt += 1
  # 연속수열 아니면 1
  else :
    cnt = 1
  # 최대 연속수열 업데이트
  ans = max(ans, cnt)

print(ans)