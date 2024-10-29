import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        int a,b;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value: ");
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println("a+b="+(a+b));
        System.out.println("a+b="+(a%b));
        System.out.println("a+b="+(a*b));
        System.out.println("a+b="+(a/b));
        System.out.println("a+b="+(a%b));
        
    }
    
}
