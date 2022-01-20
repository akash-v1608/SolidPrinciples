package withSolid;
// Maintains Liskov substitution principle.
public class Paytm implements UpiPayment,CashBack{


    @Override
    public void getCashBack() {
                System.out.println("Recieved CashBack of 200 rupees");
    }

    @Override
    public void pay() {
        System.out.println("Transaction successfull through paytm, your reference payment id is: 9732389");
    }
}
