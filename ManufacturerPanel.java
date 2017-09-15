import java.awt.Dimension;

import javax.swing.*;
public class ManufacturerPanel extends JPanel {
	
	public ManufacturerPanel() {
    	String name = "Name: Sanden Enos";
    	String jobDescript1 = "Job Description: Companies need parts. Parts are cheaper found than bought. Doesn't";
    	String jobDescript2 = "matter what you need, you'll always be operational with Sanden the Manufacturer around. ";
    	String education1 = "Education: 'nothing formal', says Sanden. 'My cousin taught me most of the trade.'";

    	this.setLayout(null);
    	setPreferredSize(new Dimension(700,134));
    	ImageIcon manufacturerImage = new ImageIcon("images/manufacturer.jpg");
    	JLabel imageLabel = new JLabel(manufacturerImage);
    	this.add(imageLabel);
    	imageLabel.setLocation(4,4);
    	imageLabel.setSize(84,126);

    	JLabel nameLabel = new JLabel(name, SwingConstants.LEFT);
    	this.add(nameLabel);
    	nameLabel.setLocation(100, 30);
    	nameLabel.setSize(1000,15);

    	JLabel jobLabel1 = new JLabel(jobDescript1, SwingConstants.LEFT);
    	this.add(jobLabel1);
    	jobLabel1.setLocation(100, 60);
    	jobLabel1.setSize(1000,15);

    	JLabel jobLabel2 = new JLabel(jobDescript2, SwingConstants.LEFT);
    	this.add(jobLabel2);
    	jobLabel2.setLocation(100, 75);
    	jobLabel2.setSize(1000,15);

    	JLabel educationLabel = new JLabel(education1, SwingConstants.LEFT);
    	this.add(educationLabel);
    	educationLabel.setLocation(100, 105);
    	educationLabel.setSize(1000,15);
    }
}
