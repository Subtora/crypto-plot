import org.json.JSONException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;


public class Draw extends JPanel implements ActionListener {

    private int height = View.getWindowH();
    private int width = View.getWindowW();
    private int screenPos = 0;
    private int rectSize = 490;


    public Draw() {
        setSize(View.windowW, View.windowH);

        Timer clock = new Timer(10, this);
        clock.start();
    }

    public double liveCost() {
        try{
            return JsonReader.getPrice();}
        catch(IOException ioE){}
        catch(JSONException jsonE){}
        return -1;
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);

        g2d.setColor(Color.red);
        g2d.fillRect((width/2)-(rectSize/2)+screenPos, (height/2)-(rectSize/2), rectSize, rectSize);
//
//        g2d.drawLine(leadPoint.getX(), leadPoint.getY(), trailPoint.getX(), trailPoint.getY());

//
//        g2d.drawString("Last Price:  $"+cost, costPos.getX(), costPos.getY());

    }

    private void updateVectors() {
        screenPos-=1;
    }

    public void actionPerformed(ActionEvent arg0) {
        repaint();
        updateVectors();
    }

}
