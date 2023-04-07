N, M = map(int, input().split())
card = list(map(int, input().split()))
jack = []
for i in range(N):
    for j in range(i+1,N):
        for k in range(j+1,N):
            if (card[i] + card[j] + card[k] <= M):
                jack.append(card[i] + card[j] + card[k])
print(max(jack))