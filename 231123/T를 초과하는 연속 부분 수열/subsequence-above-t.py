# 숫자 n과 t을 input
n, t = tuple(map(int, input().split()))
# array에 변수들을 저장
array = tuple(map(int, input().split()))
# 0으로 초기화
ans, cnt = 0, 0
# t 보다 큰 숫자가 있는지 판별
TF = False

for i in range(n) :
  # index 가 1 이상 숫자가 t 초과인수
  if i >= 1 and array[i] > t :
    # TF를 true로 변경 cnt + 1
    TF = True
    cnt += 1
  # 없으면 cnt 0으로 초기화
  else :
    cnt = 0
  # 최대 연속 수열 저장
  ans = max(ans, cnt)
# t보다 높은 수가 존재하면 ans를 출력
if TF :
  print(ans)
# 없으면 0 출력
else :
  print(0)