import java.awt.*;
import java.awt.geom.*;
/**
 * Created by Instructor on 8/6/2015.
 */
public class CircleDraw extends Panel {
    Shape circle = new Ellipse2D.Float(100.0f, 100.0f, 100.0f, 100.0f);
    public void paint(Graphics g) {
        Graphics2D ga = (Graphics2D)g;
        ga.draw(circle);
    }
    public static void main(String args[]) {
        Panel panel = new CircleDraw();
        panel.setSize(300, 250);
        panel.setVisible(true);
    }
}
/*tasasdasdasda test*/