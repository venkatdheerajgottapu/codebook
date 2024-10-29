import java.util.Scanner;

public class hell {
    public static void main(String[] args) {
        double n;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value: ");
        n=scan.nextDouble();
        double square=Math.sqrt(n);
        if(((double)square*square)==n){
            System.out.println("prefet suqare");

        }
        else{
            System.out.println("not a prefect square");
        }
    }
    
}
