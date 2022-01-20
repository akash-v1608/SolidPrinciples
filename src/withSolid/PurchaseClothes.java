package withSolid;

public class PurchaseClothes {
    public void purchase(String brand,String gender,String transactionMedium)
    {
        if(brand.equals("UCB"))
        {
            if(gender.equals("mens"))
            {
              UcbMens ucb=new UcbMens();
                      ucb.getMensWear();

            }
            else if(gender.equals("kids"))
            {
                UcbKids ucb=new UcbKids();
                ucb.getKidsWear();
            }
            else
            {
                System.out.println("clothes not available for specified gender");
                return;
            }

            UcbPayments ucbPayments=new UcbPayments();
            ucbPayments.makePayment(transactionMedium);
        }
        else
        {
            System.out.println("invalid brand");

        }
    }
}
