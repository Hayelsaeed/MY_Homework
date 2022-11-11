import java.awt.Rectangle;
public class H4A {
    public static void main(String[] args) {

        Rectangle r=new Rectangle(15,30);
        double p=2*(r.getHeight())+2*(r.getWidth());
        System.out.println("perimeter:%.1f\n"+p);
        System.out.println("Expected:90.0");
    }
}
