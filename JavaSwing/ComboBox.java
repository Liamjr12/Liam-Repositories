package Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBox extends JFrame implements ActionListener{

    JComboBox<String> comboBox;
    JLabel label;

    ComboBox(){
        this.setTitle("ComboBox");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(getSelection());
        this.add(getComboBox());
        this.pack();
        this.setVisible(true);
    }

    public JComboBox<String> getComboBox() {
        String selection[] = {"Mathematics", "Science", "History", "Philosophy"};
        comboBox = new JComboBox<>(selection);
        comboBox.addItem("Coding");
        comboBox.removeItem("Philosophy");
        comboBox.setSelectedIndex(3);
        comboBox.insertItemAt("Physical Education", 4);
        //comboBox.removeAllItems();
        return comboBox;
    }

    public JLabel getSelection() {
        label = new JLabel("Select your favorite subject");
        return label;
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }

    public static void main(String args[]) {
        new ComboBox();
 
    }

}
