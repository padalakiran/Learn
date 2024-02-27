# to reverse list we can use two methods those are using slicing or swaping elements
# 1.By using Slicing    :- in slicing we use list[::-1] which can reverse list
# 2.By swaping Elements :- in swaping Elements we can run loop by half of length of array
#                          and we can simply Swap array by swaping the elements by fist with 
#                          last element.
# Below is the code for swaping Elements in an array

def revlist(l):
    for i in range(len(l)//2):
        l[i],l[-i-1]=l[-i-1],l[i]
    return l
l=[1,2,3,4,5,6,7,8]
print(revlist(l))