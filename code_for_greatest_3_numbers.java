import java.util.Scanner;

public class code_for_greatest_3_numbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value: ");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        if(a  > b && a>c){
            System.out.println("greatest"+a);
        }
        else if(b > c){
            System.out.println("greatest"+b);
        }
        else
        {
            System.out.println("c is greater");
        }

    }
    
}
