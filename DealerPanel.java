import javax.swing.*;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;
public class DealerPanel extends JPanel {
    private ImageIcon dealer;
    private String name;
    private String jobDescription;
    private String education;
    
    
    public DealerPanel() {
        
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        setPreferredSize(new Dimension(1000, 650));
        Font font = new Font("Arial", Font.BOLD, 16);
        dealer = new ImageIcon("./images/Dealer.jpg");
        name = "Name: Silent Bob";
        jobDescription = "Job Description: Selling by the Quick Stop";
        education = "Education: PhD Marketing Princeton";
        JLabel dealerL = new JLabel(dealer);
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
        add(dealerL,c);
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
