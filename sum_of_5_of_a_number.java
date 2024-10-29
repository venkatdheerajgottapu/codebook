public class sum_of_5_of_a_number {
    public static void main(String[] args) {
    int n=121,sum=0,rem=0;
    while (n!=0) {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
        
    }
    System.out.println(sum);

    
}
