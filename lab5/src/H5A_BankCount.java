public class H5A_BankCount {
    private double p;
    public H5A_BankCount(double a ){
        p = a;
    }
    public H5A_BankCount(){
        p =0;
    }

    public void deposits(double S) {
        p +=S;
    }
    public void withdraws(double S) {
        p -=S;
    }

    public double getP() {
        return p;
    }

    public void addinterest(double interest)
    {
        p =((interest/100)* p)+ p;

    }

}
