import javax.swing.JFrame;

public class MainFrame {

	public static void main(String[] args) {
		
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
