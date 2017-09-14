import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainPanel extends JPanel {
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
	public MainPanel()
	{
		setPreferredSize(new Dimension(600,500));
		
		b1 = new JButton("Accountant");
        b2 = new JButton("El Jefe");
        b3 = new JButton("Dealer");
        b4 = new JButton("Manufacturer");
        b5 = new JButton("Muscle");
        
		b1.addActionListener(new buttonListener());
        b2.addActionListener(new buttonListener());
        b3.addActionListener(new buttonListener());
        b4.addActionListener(new buttonListener());
        b5.addActionListener(new buttonListener());
        
		add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
	}
	
	private class buttonListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
            Object buttonPushed = arg0.getSource();
            JPanel p = new JPanel();
            if (buttonPushed == b1) {
                p = new AccountantPanel();
                newFrame(p);
            }
            if (buttonPushed == b2) {
                p = new JefePanel();
                newFrame(p);
            }
            if (buttonPushed == b3) {
                p = new DealerPanel();
                
            }
            if (buttonPushed == b4) {
                p = new ManufacturerPanel();
            }
            if (buttonPushed == b5) {
                p = new MusclePanel();
            }
            newFrame(p);
		}
		
	}
    
    public void newFrame(JPanel panel) {
        JFrame f = new JFrame("Besmoke");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.getContentPane().add(panel);
        f.pack();
        f.setVisible(true);
    }
	
}
