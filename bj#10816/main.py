n = int(input())
ncard = list(map(int,input().split()))
m = int(input())
mcard = list(map(int,input().split()))
countcard = {}
for i in mcard:
    countcard.update({i:0})

for i in ncard: # n길이 만큼
    if i in countcard:
        countcard[i] += 1

for i in mcard:
    print(countcard[i], end = ' ')
