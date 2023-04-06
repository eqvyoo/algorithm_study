N = int(input())
F = int(input())
str_N = str(N)
for i in range(100):
    N = (N // 100) * 100
    N = N + i
    if N % F == 0 and i >= 10:
        print(i)
        break;
    elif N % F == 0 and i < 10:
        print("0"+str(i))
        break;
    else:
        continue
