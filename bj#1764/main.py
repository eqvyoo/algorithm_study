n, m = map(int, input().split())
hear = {}
see = {}
hear_see = []
for i in range(n):
    hear[input()] = i
for i in range(m):
    see[input()] = i
for i in see:
    if i in hear:
        hear_see.append(i)
print(len(hear_see))
hear_see = sorted(hear_see)
for i in hear_see:
    print(i)