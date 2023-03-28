T = int(input())
for i in range(T):
    cnt = 0
    s, p = map(str, input().split())
    cnt += s.count(p)
    print(cnt + len(s) - cnt*len(p))



