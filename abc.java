import java.lang.Math;
import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        int n;
        double s;
         Scanner scan=new Scanner(System.in);
        System.out.println("enter the value: ");
        n=scan.nextInt();
        s=Math.sqrt(n);

        if((s*s)==n){
            System.out.println("perfect Sqaure");
        }
        else{
            System.out.println("not a perfect square");
        }
    }
}
