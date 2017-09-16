import javax.swing.*;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;
public class JefePanel extends JPanel {
    private ImageIcon jefe;
    private String name;
    private String jobDescription;
    private String education;
    
    
    public JefePanel() {
        
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        setPreferredSize(new Dimension(900, 650));
        Font font = new Font("Arial", Font.BOLD, 25);
        jefe = new ImageIcon("./images/jefe.jpg");
        name = "Name: El Jefe Grande";
        jobDescription = "Job Description: I OWN YOU!";
        education = "Education: BA Street Science";
        JLabel jefeL = new JLabel(jefe);
        JLabel nameL = new JLabel(name);
        JLabel jobL = new JLabel(jobDescription);
        JLabel edL = new JLabel(education);
        nameL.setFont(font);
        jobL.setFont(font);
        edL.setFont(font);
        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 1;
        c.weightx = .5;
        c.gridheight = 3;
        add(jefeL,c);
        c.gridheight = 1;
        c.gridx = 1;
        c.weighty = .5;
        add(nameL,c);
        c.gridy = 1;
        add(jobL,c);
        c.gridy =2;
        add(edL,c);
    }
    
}
