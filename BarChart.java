
package problem12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author TANZIMUL ISLAM
 */
public class BarChart extends Applet {
    int year[] = {2010,2011,2012,2013,2014};
    int sales[] = {200,300,250,400,100};
    
    public void init() {
     super.init();
     setBackground(Color.YELLOW);
     setForeground(Color.RED);
    }
    public void paint(Graphics grphcs){
        super.paint(grphcs);
        
        for (int i = 0; i < sales.length; i++) {
            grphcs.fillRect(50, (i*50)+30, sales[i], 30);
            grphcs.drawString(""+year[i],20,(i*50)+40);
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}
