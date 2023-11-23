n = int(input())

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

ans, cnt = 0, 0

for i in range(n) :
  if i >= 1 and ne_po_dis(array[i]) == ne_po_dis(array[i - 1]) :
    cnt += 1
  else :
    cnt = 1
  ans = max(ans, cnt)

print(ans)