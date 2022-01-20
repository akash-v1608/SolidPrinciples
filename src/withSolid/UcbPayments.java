package withSolid;

// Maintains Ocp and Dip principle
public class UcbPayments implements  Payments{

    BankCard bankcard;
    @Override
    public void makePayment(String medium) {
        if(medium.equals("DebitCard"))
        {
          bankcard=new DebitCard();
          bankcard.doTransaction();
        }
        else if(medium.equals("CreditCard"))
        {
            bankcard=new CreditCard();
            bankcard.doTransaction();
        }
        else if(medium.equals("Paytm"))
        {
            Paytm paytm=new Paytm();
            paytm.pay();
        }
        else
        {
            System.out.println("invalid Transaction");
        }

    }
}
