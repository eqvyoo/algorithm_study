n, k = map(int, input().split())
count = 0
for i in range(1,n+1):
    if count == k - 1 and n % i == 0:
        print(i)
        exit()
    elif n % i == 0:
        count += 1
if k > count:
    print(0)

