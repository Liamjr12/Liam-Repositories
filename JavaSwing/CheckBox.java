package Test;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

public class CheckBox implements ActionListener{

    private JFrame frame;
    private JButton button;
    private JCheckBox box;

    CheckBox() {
        frame = new JFrame("CheckBox");
        frame.setLayout(new FlowLayout());
        frame.add(submitButton());
        frame.add(getCheckBox());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JButton submitButton() {
        button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);
        return button;
    }

    public JCheckBox getCheckBox() {
        box = new JCheckBox("Sasama ba ako sainyo?");
        box.setFont(new Font("Serif", Font.BOLD, 18));
        box.setFocusable(false);
        return box;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Fuck you! " + box.isSelected());
        }
    }

    public static void main(String args[]) {
        new CheckBox();
    }

}
