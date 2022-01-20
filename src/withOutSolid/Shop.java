package withOutSolid;

interface  Shop
{
    //violates interface segregation principle.
    public void displayKidsWear();
    public void displayWomensWeare();
    public void payments(String medium);
    public void displayMensWeare();
}
