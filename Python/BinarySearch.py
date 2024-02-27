# For binary Search We need 
# 1.Sorted Array      :- We are Going to Sort Array using Sorting techniques like bubble sort, quick sort etc..,
#                       for large sixe array mostly we use quick sort which has o(logn) time complexity
# 2.BinarySearch logic:- After Sorting Array we need to find mid using formula and then check weather mid element
#                       is equal to our target element if it equal to mid then return mid or it check elif condition
#                       which is mid element is grater or lesser than the target element if mid element grater than target
#                       it will check first part or it will check second part of array like using range of (0,mid-1)
#                       or (mid,length(array)-1)
# Above logic can be implimented using two ways which is loops/Recurssion But Recurssion will be more efficiant
# Logic for the BinarySearch Given Below

def bins(l,ele,low,high):
    if(high>=low):
        
        mid=low+(high-low)//2
        if(l[mid]==ele):
            return mid
        elif(l[mid]>ele):
            return bins(l,ele,low,mid-1)
        else:
            return bins(l,ele,mid+1,high)
    else:
        return -1
print(bins([1,2,3,4,5,6,7],6,0,len([1,2,3,4,5,6,7])-1))