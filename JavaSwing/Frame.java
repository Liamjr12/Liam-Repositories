package JavaSwing;

import javax.swing.JFrame;
import java.awt.Color;

public class Frame {

    private JFrame frame;
    private static final int x = 750;
    private static final int y = 500;

    Frame() {
        frame = new JFrame();
        frame.setSize(x, y);
        frame.setTitle("This is Frame");
        frame.getContentPane().setBackground(Color.magenta);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        new Frame();
    }
}
