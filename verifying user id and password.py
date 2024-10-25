#define_ing user id and password
cust_id="venkatadheeraj"
cust_pass="hamsini_vashaspathi"
#max_attempts
max_attempts=3
#logic part
for i in range(max_attempts):
    #verifying user id password
    user_id=input("Enter your user id: ")
    if(user_id==cust_id):
        #verfiying password
        password=input("Enter your password: ")
        if(password==cust_pass):
            print("login sucessful")
            break
        else:
            print("login failed",max_attempts-1-i,"attempts left")
    else:
        print("worng user id")
        break
    if(i == max_attempts-1):
      print("login failed")
    