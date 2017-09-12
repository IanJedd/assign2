import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainPanel extends JPanel {
    
	public MainPanel() {
	setPreferredSize(new Dimension(600,500));
	
	JButton b1 = new JButton("Accountant");
        JButton b2 = new JButton("El Jefe");
        JButton b3 = new JButton("Dealer");
        JButton b4 = new JButton("Manufacturer");
        JButton b5 = new JButton("Muscle");
        
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

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JFrame myFrame = new JFrame("Besmoke");
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add panel
		MainPanel myPanel = new MainPanel();
		
		myFrame.getContentPane().add(myPanel);
		
		// pack
		myFrame.pack();
		
		// set visible
		myFrame.setVisible(true);
		}
		
	}
	
}
