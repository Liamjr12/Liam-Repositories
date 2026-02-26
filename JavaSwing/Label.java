package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Label {

    //Swing Objects
    private JFrame frame;
    private JLabel label;
    private ImageIcon icon;

    //GUI Attributes
    private static final int x = 750;
    private static final int y = 550;
    private static final String title = "Project Label";
    private static final String inText = "Hello World!";
    private static final Color frameColor = new Color(210, 70, 60);
    private static final Font labelFont = new Font("Times New Roman", Font.ITALIC, 36);

    Label() {
        frame = myFrame();
        label = frameLabel();
        frame.add(label);
        frame.setVisible(true);
    }

    public JFrame myFrame() {
        frame = new JFrame();
        icon = new ImageIcon("D:\\Downloads\\icon.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(x, y);
        frame.setResizable(false);
        frame.setTitle(title);
        frame.getContentPane().setBackground(frameColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public JLabel frameLabel() {
        label = new JLabel();
        icon = new ImageIcon("D:\\Downloads\\icon2.png");
        label.setText(inText);
        label.setIcon(icon);
        label.setForeground(Color.WHITE);
        label.setFont(labelFont);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        return label;
    }
    
    public static void main(String[] args) {
        new Label();
    }
    
}
