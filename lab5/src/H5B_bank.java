public class H5B_bank {
    private double b;
    public H5B_bank(double s ){
        b =s;
    }
    public H5B_bank(){
        b =0;
    }

    public void dep(double x) {
        b +=x;
    }
    public void with(double amount) {
        b -=amount;
    }
    public double getB() {
        return b;
    }

    public void mystry(H5B_bank that, double a)
    { this.b = this.b - a;
        that.b = that.b + a; }

    public void addInterest(double interest)
    {
        b =((interest/100)* b)+ b;

    }
}
