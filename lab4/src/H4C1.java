import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
public class H4C1 extends JComponent {
    public void paintComponent(Graphics g)
    {
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.fillRect(10,10,200,50);
        g2.setColor(Color.RED);
        g2.drawString("Hayel Saeed",40,40);
    }

}
