import java.util.Scanner;

public class print_n_numbers {
    public static void main(String[] args) {
        
        int n;
         Scanner scan=new Scanner(System.in);
        System.out.println("enter the value: ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
    
    
}
