import javax.swing.JFrame;

public class H4C {
    H4C1 c=new H4C1();
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(300,100);
        frame.setTitle("Hayel Saeed");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        H4C1 component=new
                H4C1();
        frame.add(component);
        frame.setVisible(true);
    }

}
