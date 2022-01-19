/**
 * GNU General Public License v3.0
 * @author  Madhurya Dutta & Bhaskar Jyoti Das
 
 */
import java.applet.*;
import java.awt.*;
public class hello extends Applet {
   
        public void init(){
      Label l1 = new Label("JavaApplet"); 
      add(l1);
    }
        public void paint(Graphics g)
        {
            g.drawString(" A ", 50, 50);
            g.drawString(" B ", 100, 100);
            g.drawString(" C  ", 150, 150);
            g.drawString(" D ", 200, 200);
            g.drawString(" E ", 250, 250);
            g.drawString(" F ", 300, 300);
            g.drawString(" G ", 350, 250);
            g.drawString(" H ", 400, 200);
            g.drawString(" I ", 450, 150);
            g.drawString(" J ", 500, 100);
            g.drawString(" K ", 550, 50);
            g.drawString(" L ", 600, 100);
            g.drawString(" M ", 650, 150);
            g.drawString(" N ", 700, 200);
            g.drawString(" O ", 750, 250);
            g.drawString("P ", 800, 300);
            g.drawString("Q ", 850, 250);
            g.drawString(" R  ", 900, 200);
            g.drawString(" S ", 950, 150);
            g.drawString(" T ", 1000, 100);
            g.drawString(" U ", 1050, 50);
            g.drawString(" V ", 1100, 100);
            g.drawString("W ", 1150, 150);
            g.drawString(" X ", 1200, 200);
            g.drawString(" Y ", 1250, 250);
            g.drawString(" Z ", 1300, 300);
            g.drawString(" Create By Madhurya & Bhaskar ", 500, 500);
        }
}
