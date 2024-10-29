import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        int n;
         Scanner scan=new Scanner(System.in);
        System.out.println("enter the value: ");
        n=scan.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        
    }
}
