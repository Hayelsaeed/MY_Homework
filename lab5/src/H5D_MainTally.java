public class H5D_MainTally {
    public static void main(String[] args) {
        H5D_TallyCounter x=new H5D_TallyCounter();
        x.setL(5);
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        System.out.println(x.getClick());


    }
}
