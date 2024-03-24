# Amstrong Number :- The number which sum of power of each digit with number of digis equal to the origina number
#                     Example:- 153= 1**3+5**3+3**3
#                                  = 1+125+27
#                                  =153 : hence it is a amstrong Number
def amstrong(n):
    r=0
    d=0
    n1=n
    while(n1>0):
        d+=1
        n1=n1//10
    while(n>0):
        r+=(n%10)**d
        n=n//10
    return r

print(amstrong(153)==153)

