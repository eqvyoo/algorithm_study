num = int(input())
k = 0
lenlist = 4*num -4
array = [["*" for col in range(k,lenlist-2*k+1)] for row in range(k,lenlist-2*k+1)]
while (True):
    if k == 2*num - 2:
        array[k][k] = "*"
        break;
    elif k % 2 == 1:
        for i in range(k, lenlist-k+1):
            for j in range(k, lenlist-k+1):
                array[i][j] = " "
        k += 1
    else:
        for i in range(k, lenlist-k+1):
            for j in range(k, lenlist-k+1):
                array[i][j] = "*"

        k += 1
for i in range(lenlist+1):
    print(''.join(array[i]))
