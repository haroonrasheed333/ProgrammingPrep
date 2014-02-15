

def main():
    tstr = "paull"

    intt = []
    for i in range(0, 256):
        intt.append(0)

    n = 0
    flag = 0
    while n < len(tstr):
        if intt[ord(tstr[n])] > 0:
            print "The characters in the string are not unique"
            break 
        else:
            intt[ord(tstr[n])] += 1

        n += 1

    print "The characters in the string are unique"
   
   

if __name__ == '__main__':
    main()
