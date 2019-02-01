
import javax.swing.*;
import java.awt.*;


public class GlazMain {
    public static String windowName = "Rainbow Six";
    static public  WindowHandler window = new WindowHandler(windowName);
    public static ColorFinder colorfinder = new ColorFinder();
    public static GlazTrigger Gui = new GlazTrigger();
    public static Mouse mouse = new Mouse();
    public static void main(String[] args) {


        //Create GUI
        JFrame frame = new JFrame("Glaz Trigger");
        frame.setSize(500, 600);
        frame.setContentPane(Gui.GUIPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        //Create pur Tools
    Color pixelColor = new Color(1, 1, 1);



        //Print Colors on mouse
       // pixelColor = colorfinder.getPixelColor(new Point(mouse.getPosition().x, mouse.getPosition().y));
      //  System.out.println(pixelColor.getRed() + ", " + pixelColor.getBlue() + ", " + pixelColor.getGreen());


        //Get Window Information
                Point windowPos = new Point(window.getPos().x, window.getPos().y);
                System.out.printf("\n The corner locations for the window \"%s\" are %s",
                        windowName, windowPos.x + ", " + windowPos.y );



        //Get PosPos Relative to our window
        Point relPos = new Point(mouse.getRelPosition());
       System.out.println("\n Relative Mouse Position to window is" + relPos.x + ", " + relPos.y);

        }


    }
