import itertools

n = int(input())
arr = []
for i in range(1,n+1):
    arr.append(i)

ans = list(itertools.permutations(arr, n))
for i in ans:
    print(str(i)[1:-1].replace(",",""))

