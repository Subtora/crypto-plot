import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JButton;
import java.util.*;

public class View implements ActionListener {

    private JFrame frame;
    private JPanel centerPanel;

    public static int windowH = 500;
    public static int windowW = 500;

    public View(){
        setupFrame();
        setupPanels();
        frame.setVisible(true);
    }
    public static int getWindowH() {
        return windowH;
    }

    public static int getWindowW() {
        return windowW;
    }
    private void setupFrame() {
        frame = new JFrame("ETH:USDT BINANCE");
        frame.setSize(windowW,windowH);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
    }

    private void setupPanels() {


        centerPanel = new Draw();
        centerPanel.setBackground(Color.white);
        centerPanel.setSize(windowW,windowH);

        frame.add(centerPanel);
    }

    public void actionPerformed(ActionEvent event) {
    }


}//end class MyPanel

