w=int(input("enter the weight of the watermelon"))
if (1<=w<=100):
    if(w%2!=0 or w==2):
        print("No")
    else:
        x=w//2
        if(x%2==0):
            print(x,x)
            
        else:
            print(x-1,x+1)
      

