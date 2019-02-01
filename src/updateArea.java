import java.awt.*;

public class updateArea extends Thread {
    private static Color color = new Color(0,0,0);
    public static float[] hsb = new float[2];
    public static float[] hsb2 = new float[2];
    public static float[] hsb3 = new float[2];
    public static float[] hsb4 = new float[2];




    @Override
    public void run() {

        while(GlazMain.Gui.running) {

           // Point relPos = new Point(RobotTest.mouse.getRelPosition());
            Point relPos = new Point(939, 539);
//            RobotTest.Gui.xy.setText(relPos.x + ", " + relPos.y);
            hsb = GlazMain.colorfinder.getRelPixelColor(relPos);
            hsb2 = GlazMain.colorfinder.getRelPixelColor(new Point(relPos.x - 2, relPos.y));
            hsb3 = GlazMain.colorfinder.getRelPixelColor(new Point(relPos.x + 2, relPos.y));
            hsb4 = GlazMain.colorfinder.getRelPixelColor(new Point(relPos.x, relPos.y + 2));
            GlazMain.Gui.textPane1.setText("Hue:" + hsb[0] + "\n Saturation: " + hsb[1] + "\n Brightness: " + hsb[2]);

        }
        if (!GlazMain.Gui.running)
            Thread.interrupted();
        }
    }

