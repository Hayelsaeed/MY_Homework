public class H4D {
    public static void main(String[] args) {
        String x="Mississippi";
        System.out.println("x="+x);

        System.out.println("x-="+x.replaceAll("i","!"));
        System.out.println("the expected (m!ss!ss!pp!)");

        System.out.println("x_-="+x.replace("s","$"));
        System.out.println("the expected (mi$$i$$ippi)");
    }
}
