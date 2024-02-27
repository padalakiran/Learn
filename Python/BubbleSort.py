# BUbbleSort:- it is a sorting technique used to sort list/array By iterarting and comparing through each element
#              time complexity will be O(n^2)

def BUbbleSort(l):
    for _ in range(len(l)-1):
        for i in range(len(l)-1):
            if l[i]>l[i+1]:
                l[i],l[i+1]=l[i+1],l[i]
    return l
l=[9,8,1,6,3,2,0,5,4]
print(BUbbleSort(l))