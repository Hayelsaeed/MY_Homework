public class H5C_Save {
    private double b;
    private double interest;

    public H5C_Save(double intialize, double interest ){
        b =intialize;
        this.interest=interest; }

    public void deposit(double amount) {
        b +=amount;
    }
    public void withdraw(double amount) {
        b -=amount;
    }

    public double getB() {
        return b;
    }

    public void addInterest()
    {
        b =((this.interest/100)* b)+ b;

    }
}
