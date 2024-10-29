public class reverse_of_number {
    public static void main(String[] args) {
        int n=1234,sum=0,rem=0;
        while (n!=0) {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
            
        }
        System.out.println(sum);
    }
    
}
