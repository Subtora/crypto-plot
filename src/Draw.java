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

    private int rectSizeH = 10;
    private int rectSizeW = 5;

    private int sleepTime = 1;
    private Random rand;

    private point increment = new point(-1,0);

    private point center = new point((width/2)-(rectSizeW/2), (height/2)-(rectSizeW/2));
    private point right = new point(width-rectSizeW, center.getY());
    private point left = new point(0, center.getY());
    private point top = new point(center.getX(), 0);
    private point bottom = new point(center.getX(), height - rectSizeH);

    private point rectPos = new point(0,0);


    public Draw() {
        setSize(View.windowW, View.windowH);
        Timer clock = new Timer(sleepTime, this);

        clock.start();
    }
    public int r(){
        rand = new Random();
        return rand.nextInt((255 - 0) + 1) + 0;
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
        //super.paintComponent(g2d);

        if (r() % 2 == 0)
        g2d.setColor(Color.red);
        else g2d.setColor(Color.green);
        g2d.fillRect(rectPos.getX(), rectPos.getY(), rectSizeW, rectSizeH);
//
//       g2d.drawLine(leadPoint.getX(), leadPoint.getY(), trailPoint.getX(), trailPoint.getY());
//       g2d.drawString("yPos: " + rectPos.getY(), 10, 10);

    }
    private void updateVectors() {

        switchDirection(rectPos.getX(),rectPos.getY());

        rectPos.setX(rectPos.getX() + increment.getX());
        rectPos.setY(rectPos.getY() + increment.getY());
    }
    private void switchDirection(int x, int y){
        int inc = 5;
        if(x >= right.getX()){
            increment.setX(-1*inc);}
        if(x <= left.getX()){
            increment.setX(inc);}
        if(y <= top.getY()){
            increment.setY(inc);}
        if(y >= bottom.getY()){
            increment.setY(-1*inc);}
    }
    public void actionPerformed(ActionEvent arg0) {
        repaint();
        updateVectors();
    }

}
