# 연속되는 수 있는지 맞추는 알고리즘

# n 개의 수 입력 받기
n = int(input())

array = [
  int(input())
  for _ in range(n)
]

max_cnt = 0

for i in range(n) :
  if i == 0 or array[i] != array[i - 1] :
    cnt = 1
  else :
    cnt += 1
  max_cnt = max(max_cnt, cnt)
  
print(max_cnt)