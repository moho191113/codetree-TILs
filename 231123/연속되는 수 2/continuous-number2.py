# 연속되는 수 있는지 맞추는 알고리즘

# n 개의 수 입력 받기
n = int(input())

# 배열에 input을 저장
array = [
  int(input())
  for _ in range(n)
]

# 연속해서 동일한 숫자가 나오는 횟수중 회대
max_cnt = 0

for i in range(n) :
  # 만약 index가 0이거나 이전 숫자와 동일하지 않으면 cnt를 1로 초기화 
  if i == 0 or array[i] != array[i - 1] :
    cnt = 1
  # 그렇지 않으면 동일한 숫자라는 의미이기 때문에 cnt + 1
  else :
    cnt += 1
  # max_cnt 와 비교해서 cnt가 더 크면 업데이트
  max_cnt = max(max_cnt, cnt)

print(max_cnt)