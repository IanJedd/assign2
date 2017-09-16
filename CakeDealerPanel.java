import javax.swing.*;
import java.awt.*;

public class CakeDealerPanel extends JPanel
{
    public CakeDealerPanel()
    {
        String name = "<html>Name -<br/>&emsp;Matt Kelly</html>";
        String job = "<html>Job -<br/>&emsp;You need cake? I have cake.</html>";
        String education = "<html>Education -<br/>&emsp;I've read everything except The Art of the Deal.</html>";

        JLabel nameLabel = new JLabel(name);
        nameLabel.setLocation(200, 40);
        nameLabel.setSize(1000, 40);
        this.add(nameLabel);
        JLabel jobLabel = new JLabel(job);
        jobLabel.setLocation(200, 80);
        jobLabel.setSize(1000, 40);
        this.add(jobLabel);
        JLabel educationLabel = new JLabel(education);
        educationLabel.setLocation(200, 120);
        educationLabel.setSize(1000, 40);
        this.add(educationLabel);

        ImageIcon icon = new ImageIcon("images/cake_dealer.jpg");

        JLabel iconLabel = new JLabel(icon);
        iconLabel.setSize(150, 200);
        this.add(iconLabel);

        setPreferredSize(new Dimension(800,200));
        this.setLayout(null);
    }
}
