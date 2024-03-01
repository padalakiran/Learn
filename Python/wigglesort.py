# wiggle Sort:- odd index numbers should always greater than equal to
#               previous numburs and even index numbers should always
#                less than equal to next index numbers
# For wigglesort we do iterate through array and swaping numbers



def wigs(l):
    for i in range(len(l)-1):
        if(i%2==0):
            if(l[i]>l[i+1]):
                l[i],l[i+1]=l[i+1],l[i]
        else:
            if l[i]<l[i+1]:
                l[i],l[i+1]=l[i+1],l[i]
    return l

l=[3,5,2,1,6]
print(wigs(l))