public class H5E_TimeDiposit {
    private double b;
    private double interest;

    public H5E_TimeDiposit(double intialize,final double interest ){
        b =intialize;
        this.interest=interest; }


    public void withdraw() {
        b -= b;
    }

    public double getB() {
        return b;
    }

    public void addInterest()
    {
        b =((this.interest/100)* b)+ b;

    }
}
