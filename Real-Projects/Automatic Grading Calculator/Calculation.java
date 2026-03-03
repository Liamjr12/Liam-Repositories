import java.awt.event.*;
import javax.swing.*;

public class Calculation implements ActionListener {

    private JTextField[] gradeFields;
    private JTextField[] headerFields;
    private JTextField averageField;

    public Calculation(JTextField[] headerFields, JTextField... gradeFields) {
        this.headerFields = headerFields;
        this.gradeFields = gradeFields;
        this.averageField = headerFields[2];
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        if (command.equals("Average")) {
            computeAverage();
        }

        if (command.equals("Revert")) {
            clearFields();
        }
    }

    private void computeAverage() {

        double sum = 0;
        int count = 0;

        for (JTextField field : gradeFields) {
            try {
                double value = Double.parseDouble(field.getText());
                sum += value;
                count++;
            } catch (NumberFormatException ex) {
                System.out.println("NumberFormatException Error");
            }
        }

        double average = (count == 0) ? 0 : sum / count;
        averageField.setText(String.format("%.2f", average));
    }

    private void clearFields() {

        // Clear header fields
        for (JTextField field : headerFields) {
            field.setText("");
        }

        // Clear grade fields
        for (JTextField field : gradeFields) {
            field.setText("");
        }

        System.out.println("All fields cleared.");
    }
}