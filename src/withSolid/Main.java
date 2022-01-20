package withSolid;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        PurchaseClothes pc=new PurchaseClothes();
        Scanner sc=new Scanner(System.in);
        display();
        System.out.println("enter brand");
        String brand=sc.next();
        System.out.println("enter gender");
        String gender=sc.next();
        System.out.println("enter transaction medium");
        String transactionMedium=sc.next();
        pc.purchase(brand,gender,transactionMedium);
    }
    static void display()
    {
        System.out.println("brand options : UCB");
        System.out.println("Gender option : 1)kids 2)mens");
        System.out.println("Payment options : 1)debitcard 2)creditcard 3)Paytm");
    }
}
