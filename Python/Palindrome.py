# Palindrome:- if a string mean to be Palindromewhich reverse of string is equal to original string
#              Example:- madam==madam (palindrome)
#              asdc != cdsa(not a palindrome) 
def palind(s):
    r=""
    for i in range(len(s)):
        r+=s[-i-1]
    return r==s
s=input("Enter String:")
if palind(s):
    print("Palindromic String")
else:
    print("Not a Palindrome")