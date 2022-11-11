public class H5B_MainBank {
    public static void main(String[] args) {
        H5B_bank ahmed=new H5B_bank(500);
        H5B_bank mohammed=new H5B_bank(1000);
        mohammed.mystry(ahmed,500);
        System.out.println("Hayel balance="+mohammed.getB());
        System.out.println("Saeed balance="+ahmed.getB());
    }
}
