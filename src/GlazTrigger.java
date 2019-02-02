import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
                if (!list1.isSelectionEmpty()) {
                    onoff.setText("On");
                    updateArea reader = new updateArea();
                    running = true;
                    reader.start();
                    Shooter shooter = new Shooter();
                    shooter.start();
                }
                else {
                    JOptionPane.showMessageDialog(null, "You must select a map first!");

                }
            }
        });
        OFFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onoff.setText("Off");
                running = false;
            }
        });
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (running == true)
                    JOptionPane.showMessageDialog(null, "Turn off before selecting new map!");
            }
        });
    }
}
