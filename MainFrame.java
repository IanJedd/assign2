import javax.swing.JFrame;
public class MainFrame {
	public static void main(String[] args) {
		JFrame f = new JFrame("Besmoke");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainPanel p = new MainPanel();
		f.getContentPane().add(p);
		myFrame.pack();
		myFrame.setVisible(true);
	}
}
