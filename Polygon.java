
package problem13;

import java.applet.Applet;
import java.awt.Color;

import java.awt.Graphics;
/**
 *
 * @author TANZIMUL ISLAM
 */
public class Polygon extends Applet {
    int x[] = {20,50,80};
    int y[] = {80,20,80};

    public void init() {
        // TODO start asynchronous download of heavy resources
        super.init();
        setBackground(Color.YELLOW);
        setForeground(Color.RED);
    }
    public void paint(Graphics grphics){
        grphics.fillPolygon(x,y,3);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
