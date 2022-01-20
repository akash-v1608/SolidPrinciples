package withOutSolid;

public class Paytm extends UPI{

    @Override
    public void pay() {
        // logic for payment
    }

    @Override
    public void getScratchCard() {
        //Not applicable for paytm. and violates the liskov principle.
    }

    @Override
    public void getCashBack() {
            //logic to get cashback
    }
}
