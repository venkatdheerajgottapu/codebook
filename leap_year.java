import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        int year;
         Scanner scan=new Scanner(System.in);
        System.out.println("enter the value: ");
        year=scan.nextInt();
        if(year % 4==0 && year%100!=0 || year%400==0){
            System.err.println("Leap year"+year);
        }
        else{
            System.out.println("not leap year"+year);
        }

    }
    
}
