package withSolid;

public class CreditCard implements  BankCard{
    @Override
    public void doTransaction() {
        System.out.println("Credit Card Transaction succesfull");
    }
}
