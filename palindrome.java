public class palindrome {
    public static void main(String[] args) {
        int n=121,sum=0,rem=0,t;
        t=n;
        System.out.println(t);
        while (n!=0) {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
            
        }
        if(t==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

        System.out.println(sum);
    }
    
}
