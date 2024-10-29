public class Customer {
    public static void main(String[] args) {
        String customerType="Regular";
        int quantity=2;
        int unitPrice=10;
        int totalCost=0;
        int delivarycharge=5;
        int discount=5;
        totalCost=unitPrice*quantity;
        if(customerType=="Regular"){
            totalCost=totalCost-(totalCost*discount/100);
            System.out.println("Eligible fir duscount 5%");
            
        }
        else{
            totalCost=totalCost+delivarycharge;
            System.out.println("delivary charge 4 ");
        }
        System.out.println(("total cost"+totalCost));
    }
}