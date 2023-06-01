matrix = [list(map(str, input().split()))for _ in range(5)]
def dfs(x,y,num):
    if len(num) == 6:
        if num not in result:
            result.append(num)
        return

    dx = [1,0,-1,0]
    dy = [0,1,0,-1]
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx<0 or nx >= 5 or ny < 0 or ny >= 5:
            continue
        else:
            dfs(nx, ny, num + matrix[nx][ny])

result = []
for i in range(5):
    for j in range(5):
        dfs(i,j, matrix[i][j])

print(len(result))

