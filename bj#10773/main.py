def func():
    k = int(input())
    list = []
    for i in range(k):
        n = int(input())
        if n == 0:
            del list[-1]
        else:
            list.append(n)
    return sum(list)
print(func())



