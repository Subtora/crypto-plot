import org.json.JSONException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class Draw extends JPanel implements ActionListener {


    private double cost = 0;

    public Draw() {
        setSize(View.getWindowW(),View.getWindowH());
        Timer clock = new Timer(10,this);
        clock.start();
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);

        g2d.drawString("ETH:USDT  $"+cost, 100, 100);
    }

    private void updateVectors() {
        try{
        cost = JsonReader.getPrice();}
        catch(IOException ioE){}
        catch(JSONException jsonE){}


    }//end updateVectors

    public void actionPerformed(ActionEvent arg0) {
        repaint();
        updateVectors();
    }

}
