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
    private JPanel topPanel;
    private JPanel centerPanel;

    public static int windowH = 600;
    public static int windowW = 800;

    public View(){
        setupFrame();
        setupPanels();
//        setupButtons();
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
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
    }

    private void setupPanels() {

        topPanel = new JPanel();
        topPanel.setBackground(new Color(47,49,49));

        centerPanel = new Draw();

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
    }

//    private void setupButtons() {
//        JButton buyBtn = new JButton("Buy");
//        JButton sellBtn = new JButton("Sell");
//
//        buyBtn.addActionListener(this);
//        sellBtn.addActionListener(this);
//
//        addButtonStyle(buyBtn, 0, 0);
//        addButtonStyle(sellBtn, 700, 135);
//
//        topPanel.add(buyBtn);
//        topPanel.add(sellBtn);
//    }

//    private void addButtonStyle(JButton button, int x, int y){
//        button.setBounds(x, y, 60, 30);
//        button.setBackground(Color.WHITE);
//        button.setBorderPainted(false);
//        button.setFocusPainted(false);
//        button.setOpaque(true);
//    }

    public void actionPerformed(ActionEvent event) {
//        String command = event.getActionCommand();
//        if (command.equals("Sell")) {
//            sell();
//        }
//        if (command.equals("Buy")) {
//            buy();
//        }
    }

//    private void buy() {
//        ((PaintPanel) centerPanel).buy();
//    }
//
//    private void sell() {
//        ((PaintPanel) centerPanel).sell();
//    }


}//end class MyPanel

