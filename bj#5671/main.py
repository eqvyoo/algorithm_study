while True:
    try:
        firstNum, lastNum = map(int, input().split())
    except:
        break
    count = 0
    for i in range(firstNum, lastNum+1):
        i_list = list(map(int, str(i)))
        i_set = list(set(i_list))
        if len(i_set) == len(i_list):
            count += 1
    print(count)


