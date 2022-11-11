public class H5E_MainTime {

    public static void main(String[] args) {
        H5E_TimeDiposit x=new H5E_TimeDiposit(1000,7);

        x.addInterest();
        System.out.println(x.getB());
        x.withdraw();
        System.out.println(x.getB());
    }
}