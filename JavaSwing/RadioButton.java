package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends JFrame implements ActionListener {

    private ButtonGroup buttons;
    private JPanel radioPanel;
    private JLabel frameLabel;
    private JRadioButton customButton;
    private JRadioButton maleButton;
    private JRadioButton femaleButton;

    RadioButton() {
        this.setTitle("RadioButton");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(frameLabel(), BorderLayout.NORTH);
        this.add(getRadioButton(), BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }

    public JPanel getRadioButton() {
        radioPanel = new JPanel();

        customButton = new JRadioButton("Unknown");
        customButton.setFocusable(false);
        customButton.addActionListener(this);    

        maleButton = new JRadioButton("Male");
        maleButton.setFocusable(false);
        maleButton.addActionListener(this);

        femaleButton = new JRadioButton("Female");
        femaleButton.setFocusable(false);
        femaleButton.addActionListener(this); 

        buttons = new ButtonGroup();
        buttons.add(customButton);
        buttons.add(maleButton);
        buttons.add(femaleButton);

        radioPanel.add(customButton);
        radioPanel.add(maleButton);
        radioPanel.add(femaleButton);
        return radioPanel;
    }

    public JLabel frameLabel() {
        frameLabel = new JLabel("What is your gender?");
        frameLabel.setHorizontalTextPosition(JLabel.CENTER);
        frameLabel.setVerticalTextPosition(JLabel.TOP);
        return frameLabel;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == maleButton) {
            System.out.println("User chooses Male");
        } else if (e.getSource() == femaleButton) {
            System.out.println("User chooses Female");
        } else if (e.getSource() == customButton) {
            System.out.println("Unknown gender");
        }
    }

    public static void main(String args[]) {
        new RadioButton();
    }
}
