package withOutSolid;

public class Ucb implements Shop{

    @Override
    public void displayKidsWear() {
        //violates srp
    }

    @Override
    public void displayWomensWeare() {

    }

    @Override
    public void payments(String medium) {
        //violatest ocb and dip
        if(medium.equals("DebitCard"))
        {
            //debit card logicc
        }
        else if(medium.equals("CreditCard"))
        {
            //credit card logic
        }
        else if(medium.equals("Paytm"))
        {
            Paytm paytm=new Paytm();
        }

    }

    @Override
    public void displayMensWeare() {

    }
}
