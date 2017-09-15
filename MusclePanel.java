package test;

import java.awt.*;
import javax.swing.*;


public class MusclePanel extends JPanel {
    public MusclePanel() {
    	String name = "Name: Jule 'Libuella' Olivieri";
    	String muscle1 = "Job Description: Yeah, I know I don't look like it, but I'm the muscle in this group.";
    	String muscle2= "Don't let the fact that I'm short fool you; I'm the toughest gal on this block.";
    	String education = "I may or may not be from New York...may or may not be Italian...and may or may not have been trained by the mob.";

    	this.setLayout(null);
    	setPreferredSize(new Dimension(800,134));
    	ImageIcon muscleImage = new ImageIcon("images/Mob Pic.jpg");
    	JLabel imageLabel = new JLabel(muscleImage);
    	this.add(imageLabel);
    	imageLabel.setLocation(4,4);
    	imageLabel.setSize(84,126);

    	JLabel nameLabel = new JLabel(name, SwingConstants.LEFT);
    	this.add(nameLabel);
    	nameLabel.setLocation(100, 4);
    	nameLabel.setSize(1000,15);

    	JLabel jobLabel1 = new JLabel(muscle1, SwingConstants.LEFT);
    	this.add(jobLabel1);
    	jobLabel1.setLocation(100, 27);
    	jobLabel1.setSize(1000,15);

    	JLabel jobLabel2 = new JLabel(muscle2, SwingConstants.LEFT);
    	this.add(jobLabel2);
    	jobLabel2.setLocation(100, 42);
    	jobLabel2.setSize(1000,15);

    	JLabel educationLabel = new JLabel(education, SwingConstants.LEFT);
    	this.add(educationLabel);
    	educationLabel.setLocation(100, 95);
    	educationLabel.setSize(1000,15);
    }
}