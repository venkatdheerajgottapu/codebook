import java.util.Scanner;

public class prime_or_not{
    public static void main(String[] args){
        int n,i,count=0;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();  
        for( i=1;i<=7;i++){
            if(n%i==0)
                if(count==2){
                    count=count+i;
                    break;
                }
                
                else{
                    System.out.println("Not a prime"+i);
                }
        }
    }
                
}            
    
    


