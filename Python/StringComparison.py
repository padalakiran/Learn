def sol(a,b):
    c=list(a)
    d=list(b)
    
    for i in d:
        if i in c:
            c.remove(i)
        else:
            print(i)


a=input()
b=input()
sol(a,b)
