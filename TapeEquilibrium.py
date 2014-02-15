def solution(A):
    # write your code in Python 2.6
    alen = len(A)
    asum = 0
    temp = []
    for i in range(alen):
        asum += A[i]
        temp.append(asum)

    mindiff = 0
    for i in range(alen-1):
        diff = asum - temp[i]
        diff = abs(diff - temp[i])
        if diff == 0:
            return diff
        else:
            if mindiff == 0:
                mindiff = diff
            else:
                if diff < mindiff:
                    mindiff = diff

    return mindiff

print solution([3, 1, 2, 4, 3])