import java.awt.*;
import javax.swing.*;


public class AccountantPanel extends JPanel {
    public AccountantPanel() {
    	String name = "Name: Ian \"Danger\" Jedd";
    	String jobDescript1 = "Job Description: Don't let the title \"Accountant\" fool you, Ian is an all around number master. If you ever EVER";
    	String jobDescript2 = "have a number that's giving you trouble, you come to Ian and he'll take out his number wrench and number";
    	String jobDescript3 = "hammer and he'll make that number work for YOU! Cooking the books? Ian is a Michelin 3-star CHEF when it";
    	String jobDescript4 = "comes to books! Heck, he got the IRS to pay US money last year! We sure as shoot aren't paying him enough!";
    	String education1 = "Education: Education? EDUCATION?! Ian's got a PhD in accounting from EVERY Ivy League school AND MIT!";

    	this.setLayout(null);
    	setPreferredSize(new Dimension(800,134));
    	ImageIcon accountantImage = new ImageIcon("images/accountant.jpg");
    	JLabel imageLabel = new JLabel(accountantImage);
    	this.add(imageLabel);
    	imageLabel.setLocation(4,4);
    	imageLabel.setSize(84,126);

    	JLabel nameLabel = new JLabel(name, SwingConstants.LEFT);
    	this.add(nameLabel);
    	nameLabel.setLocation(100, 4);
    	nameLabel.setSize(1000,15);

    	JLabel jobLabel1 = new JLabel(jobDescript1, SwingConstants.LEFT);
    	this.add(jobLabel1);
    	jobLabel1.setLocation(100, 27);
    	jobLabel1.setSize(1000,15);

    	JLabel jobLabel2 = new JLabel(jobDescript2, SwingConstants.LEFT);
    	this.add(jobLabel2);
    	jobLabel2.setLocation(100, 42);
    	jobLabel2.setSize(1000,15);

    	JLabel jobLabel3 = new JLabel(jobDescript3, SwingConstants.LEFT);
    	this.add(jobLabel3);
    	jobLabel3.setLocation(100, 57);
    	jobLabel3.setSize(1000,15);

    	JLabel jobLabel4 = new JLabel(jobDescript4, SwingConstants.LEFT);
    	this.add(jobLabel4);
    	jobLabel4.setLocation(100, 72);
    	jobLabel4.setSize(1000,15);

    	JLabel educationLabel = new JLabel(education1, SwingConstants.LEFT);
    	this.add(educationLabel);
    	educationLabel.setLocation(100, 95);
    	educationLabel.setSize(1000,15);
    }
}
