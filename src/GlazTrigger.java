import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GlazTrigger extends JFrame {
    private JButton ONButton;
    private JButton OFFButton;
    public JPanel GUIPanel;
    private JLabel Status;
    private JLabel onoff;
    public  JTextPane textPane1;
    public JLabel mousepos;
    public  JLabel xy;
    public JList list1;
    public boolean running;
    DefaultListModel listModel;


    public GlazTrigger() {
        textPane1.setEditable(false);
        ONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onoff.setText("On");
                updateArea reader = new updateArea();
                running = true;
                reader.start();
                Shooter shooter = new Shooter();
                shooter.start();
            }
        });
        OFFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onoff.setText("Off");
                running = false;

            }
        });
    }
}
