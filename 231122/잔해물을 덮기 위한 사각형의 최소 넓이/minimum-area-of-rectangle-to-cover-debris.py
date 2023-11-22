OFFSET = 1000
MAX_R = 2000

reacts = [
    tuple(map(int, input().split()))
    for _ in range(2)
]

checked = [
  [0] * (MAX_R + 1)
  for _ in range(MAX_R + 1)
]

for i, (x1, y1, x2, y2) in enumerate (reacts, start = 1) :
  x1, y1, x2, y2 = x1 + OFFSET, y1 + OFFSET, x2 + OFFSET, y2 + OFFSET

  for row in range(x1, x2) :
    for col in range(y1, y2) :
      checked[row][col] = i

min_x, max_x, min_y, max_y = MAX_R, 0, MAX_R, 0
first_react_exist = False

for x in range(MAX_R + 1) :
  for y in range(MAX_R + 1) :
    if checked[x][y] == 1:
      first_react_exist = True
      min_x = min(min_x, x)
      max_x = max(max_x, x)
      min_y = min(min_y, y)
      max_y = max(max_y, y)
      
if not first_react_exist :
  area = 0
else :
  area = (max_x - min_x + 1) * (max_y - min_y + 1)

print(area)