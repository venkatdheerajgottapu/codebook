import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        {
            int n;
            Scanner scan=new Scanner(System.in);
            n=scan.nextInt();  
            for(int i=1;i<=7;i++){
                if(n%i==0){
                    System.out.println(i);
                }
            }
        }
    }
    
}
