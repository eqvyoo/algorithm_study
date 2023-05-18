a, b = map(int,input().split())
mat1 = [list(map(int, input().split())) for _ in range(a)]
b, c = map(int,input().split())
mat2 = [list(map(int, input().split())) for _ in range(b)]

res = [[0 for _ in range(c)] for _ in range(a)]

for i in range(a):
    for k in range(c):
        for j in range(b):
            res[i][k] += mat1[i][j] * mat2[j][k]
for i in res:
    for j in i:
        print(j, end=' ')
    print()

