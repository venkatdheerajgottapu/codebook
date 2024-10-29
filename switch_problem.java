import java.util.Scanner;

public class switch_problem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1- beginer 2- intermidete 3-expert");
        System.out.println("enter the value: ");
        a=scan.nextInt();
        switch (a) {
            case 1:
            System.out.println("beginer");
                
                break;
            case 2:
            System.out.println("intermideate");
                
                break;
            case 3:
            System.out.println("expert");
                    
                    break;
        
            default:
            System.err.println("out of range");
                break;
        }
        
    }
}
