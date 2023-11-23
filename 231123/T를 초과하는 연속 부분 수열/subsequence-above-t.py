n, t = tuple(map(int, input().split()))

array = tuple(map(int, input().split()))

ans, cnt = 0, 0

TF = False

for i in range(n) :
  if i >= 1 and array[i] > t :
    TF = True
    cnt += 1
  else :
    cnt = 0
  ans = max(ans, cnt)
if TF :
  print(ans)
else :
  print(0)