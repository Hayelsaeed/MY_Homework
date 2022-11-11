public class H5C_MainSave {
    public static void main(String[] args) {
        H5C_Save x=new H5C_Save(1000,10);
        x.addInterest();
        System.out.println("expected result= 1100");
        System.out.println(x.getB());
    }
}
