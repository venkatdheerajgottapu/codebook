import java.util.Scanner;

public class number_range {
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value: ");
        n=scan.nextInt();
        if (n==1 && n<=50){
            System.out.println("in this range 1=n<=50");
        }

        else if (51<=n && n<=100)
        {
            System.out.println("51<=n<=100");
        }
        
        else if (101<=n && n<=150)
        {
            System.out.println("51<=n<=100");
        }
        
        else if (151<=n && n<=200)
        {
            System.out.println("51<=n<=100");
        }
        else
        {
            System.out.println("out of range");

        }
        

    }
}
