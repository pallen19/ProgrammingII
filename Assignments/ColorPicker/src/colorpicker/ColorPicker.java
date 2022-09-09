package colorpicker;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.Color;
/**
 *
 * @author Paul
 */
public class ColorPicker implements MouseListener, ActionListener {
        
        int cRd;
        int cBl;
        int cGrn;
        JTextField t1;
        JFrame j1;
        JPanel p1;
        JPanel p2;
        JLabel l1;
        JLabel l2;
        Color backColor= Color.WHITE;
        Color rgbRect= Color.BLACK;
        //Constructor
        public ColorPicker(){
                begin();
            }
        public void begin(){
            j1 = new JFrame("Welcome to the Color Picker!");
            p1 = new JPanel();
            p2 = new JPanel();
            l1 = new JLabel();
            j1.add(p1);
            p1.setBackground(backColor);
            p1.add(l1);
            j1.setVisible(true);
            j1.setSize(600, 400);
            j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  Point hotSpot;
                  Robot robot = null;
                  int x=0;
                          try {
                             robot = new Robot();
                          } catch (AWTException e) {
                             //e.printStackTrace();
                             System.exit(-1);
                          }

                          Color bckgrndColor = null;
                          while (x==0) {
                              Graphics g= p1.getGraphics();
                             hotSpot = MouseInfo.getPointerInfo().getLocation();
                             bckgrndColor = robot.getPixelColor(hotSpot.x, hotSpot.y);
                             cRd = bckgrndColor.getRed();
                             cBl = bckgrndColor.getBlue();
                             cGrn = bckgrndColor.getGreen();

                             g.setColor(bckgrndColor);
                             g.fillRect(0, 25, 1280, 720);


                             p2.setBackground(bckgrndColor);
                             l1.setText("RED: " +cRd +" || "+" BLUE: " +  cBl + 
                                     " || GREEN: "+ cGrn);
                }

        }

        
    public static void main(String[] args) {
            new ColorPicker();
    }
    public void paint(Graphics g){
        g=p1.getGraphics();
        g.setColor(Color.GREEN);
        g.drawRect(100, 100, 300, 200);
    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
    public void actionPerformed(ActionEvent e) {
    }
}
