package JavaSwing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Panel {
    //Swing Objects
    private JFrame frame;
    private ImageIcon icon;
    private SwingAttributes swing;

    Panel() {
        swing = new SwingAttributes();
        frame = myFrame();
        frame.setVisible(true);
    }

    public JFrame myFrame() {
        frame = new JFrame();
        icon = new ImageIcon("D:\\Downloads\\colors.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(swing.getWidth(), swing.getHeight());
        frame.setResizable(false);
        frame.setTitle(swing.getTitle());
        frame.getContentPane().setBackground(swing.getFrameColor());
        frame.setLayout(new BorderLayout());
        frame.add(outerPanel(), BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public JPanel outerPanel() {
        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(new BorderLayout(5,5));
        outerPanel.add(innerPanel(), BorderLayout.CENTER);
        outerPanel.add(northOuterPanel(), BorderLayout.NORTH);
        outerPanel.add(westOuterPanel(), BorderLayout.WEST);
        outerPanel.add(southOuterPanel(), BorderLayout.SOUTH);
        outerPanel.add(eastOuterPanel(), BorderLayout.EAST);
        return outerPanel;
    }

    public JPanel northOuterPanel() {
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout(swing.getOuterPanelGap(), swing.getOuterPanelGap()));
        northPanel.setPreferredSize(new Dimension(swing.getWidth(), 200));
        northPanel.setBackground(Color.RED);
        return northPanel;
    }

    public JPanel westOuterPanel() {
        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.ORANGE);
        westPanel.setPreferredSize(new Dimension(200, 200));
        return westPanel;
    }

    public JPanel southOuterPanel() {
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.YELLOW);
        southPanel.setPreferredSize(new Dimension(swing.getWidth(), 200));
        return southPanel;
    }

    public JPanel eastOuterPanel() {
        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.GREEN);
        eastPanel.setPreferredSize(new Dimension(200, 200));
        return eastPanel;
    }

    public JPanel innerPanel() {
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout());
        innerPanel.add(northInnerPanel());
        innerPanel.add(westInnerPanel());
        innerPanel.add(southInnerPanel());
        innerPanel.add(eastInnerPanel());
        return innerPanel;
    }

     public JPanel northInnerPanel() {
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout(swing.getOuterPanelGap(), swing.getOuterPanelGap()));
        northPanel.setPreferredSize(new Dimension(swing.getWidth(), 200));
        northPanel.setBackground(Color.BLUE);
        return northPanel;
    }

    public JPanel westInnerPanel() {
        JPanel westPanel = new JPanel();
        westPanel.setBackground(new Color(75, 0, 130));
        westPanel.setPreferredSize(new Dimension(200, 200));
        return westPanel;
    }

    public JPanel southInnerPanel() {
        JPanel southPanel = new JPanel();
        southPanel.setBackground(new Color(127, 0, 255));
        southPanel.setPreferredSize(new Dimension(swing.getWidth(), 200));
        return southPanel;
    }

    public JPanel eastInnerPanel() {
        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(new Color(95,75,139));
        eastPanel.setPreferredSize(new Dimension(200, 200));
        return eastPanel;
    }

    public static void main(String args[]) {
        new Panel();
    }
}
