package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener {

    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JPanel panel;
    private ImageIcon icon;
    private SwingAttributes swing;
    private JTextField emailField;
    private JTextField passwordField;

    Button() {
        swing = new SwingAttributes();
        frame = myFrame();
        frame.setVisible(true);
    }

    public JFrame myFrame() {
        frame = new JFrame();
        icon = new ImageIcon("D:\\Downloads\\email.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(swing.getWidth(), swing.getHeight());
        frame.setResizable(false);
        frame.setTitle(swing.getTitle());
        frame.getContentPane().setBackground(swing.getFrameColor());
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(frameLabel());
        frame.add(logInPanel());
        frame.add(emailField());
        frame.add(passwordField());
        return frame;
    }

    public JLabel frameLabel() {
        label = new JLabel();
        label.setText("Welcome to Email Generator");
        label.setFont(new Font("Serif", Font.BOLD, 36));
        label.setBounds(0, 50, 750, 50);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        return label;
    }

    public JPanel logInPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(240, 350, 250, 40);
        panel.add(logInButton());
        return panel;
    }

    public JButton logInButton() {
        button = new JButton("Log In");
        button.setBounds(0,0,250, 40);
        button.setFocusable(false);
        button.addActionListener(this);
        return button;
    }

    public JTextField emailField() {
        emailField = new JTextField();
        emailField.setLayout(null);
        emailField.setBounds(240, 250, 250, 40);
        emailField.setText("Username");
        emailField.setCaretColor(Color.LIGHT_GRAY);
        return emailField;
    }

    public JTextField passwordField() {
        passwordField = new JTextField();
        passwordField.setLayout(null);
        passwordField.setBounds(240, 300, 250, 40);
        passwordField.setText("Password");
        passwordField.setCaretColor(Color.LIGHT_GRAY);
        return passwordField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
        String username = emailField.getText();
        String password = passwordField.getText();
        
            // Validate login
            if (!username.isEmpty() && !password.isEmpty()) {
                System.out.println("Hello " + username);
            } else {
                System.out.println("Please fill all fields");
            }
        }
    }

    public static void main(String args[]) {
        new Button();
    }

}
