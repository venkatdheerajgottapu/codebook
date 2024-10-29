import java.util.Scanner;

public class even_And_odd {
    public static void main(String[] args) {
        int n;
         Scanner scan=new Scanner(System.in);
        System.out.println("enter the value: ");
        n=scan.nextInt();
        System.out.println("Even numbers");
        for(int i=1;i<=n;i++){
            if(i%2==0)
            System.out.println( i);
        }
        System.out.println("odd");
        for(int i=1;i<=n;i++){
            if(i%2==1)
            System.out.println( i);
        }
    }
    
}
