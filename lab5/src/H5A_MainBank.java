public class H5A_MainBank {
    public static void main(String[] args) {
        H5A_BankCount bank =new H5A_BankCount();
        bank.deposits(1000);
        bank.withdraws(500);
        bank.withdraws(400);
        System.out.println("expected balance= 100");
        System.out.println(bank.getP());
        bank.deposits(900);
        bank.addinterest(10);
        System.out.println(bank.getP());

    }
}
