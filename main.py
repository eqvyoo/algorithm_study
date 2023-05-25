import itertools
n, m = map(int,input().split())
all_num = [i for i in range(1,n+1)]
res = itertools.permutations(all_num, m)
for i in res:
    for j in i:
        print(j, end=' ')
    print()