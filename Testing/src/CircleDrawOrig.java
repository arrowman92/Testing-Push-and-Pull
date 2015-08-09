import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class CircleDrawOrig extends Frame {
  Shape circle = new Ellipse2D.Float(100.0f, 100.0f, 100.0f, 100.0f);
  Shape square = new Rectangle2D.Double(100, 100,100, 100);
  public void paint(Graphics g) {
  Graphics2D ga = (Graphics2D)g;
  ga.draw(circle);
  }

  public static void main(String args[]) {
      Frame frame = new CircleDrawOrig();
      frame.addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent we){
            System.exit(0);
         }
      });
  frame.setSize(300, 250);
  frame.setVisible(true);
  }
}