import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    UIConstant c = new UIConstant();

    Display() {
        this.setSize(c.getFrameWidth(), c.getFrameHeight());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle(c.getFrameTitle());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(c.getFrameColor());
        ImageIcon icon = new ImageIcon("D:\\Downloads\\statistics.png");
        this.setIconImage(icon.getImage());
        this.setLayout(null);
        addDisplayInterface();
    }

    public void addDisplayInterface() {
        JLabel nameLabel = getLabel("Name:", 70,30, 0, 22);
        JTextField nameField = getTextField(180,36, 250,20);
        JLabel sectionLabel = getLabel("Section: ", 70, 70, 0, 22);  
        JTextField sectionField = getTextField(180,76,250,20);

        JComboBox<String> mySubject1 = getComboBox(70,180);
        JLabel subjectLabel1 = getLabel("(Subject I)",70,155,2,12);
        JLabel gradeLabel1 = getLabel("(Grade I)",380,155,2,10);
        JTextField myGrade1 = getTextField(380,180, 50, 25);

        JComboBox<String> mySubject2 = getComboBox(70,240);
        JLabel subjectLabel2 = getLabel("(Subject II)",70,215,2,12);
        JLabel gradeLabel2 = getLabel("(Grade II)",380,215,2,10);
        JTextField myGrade2 = getTextField(380,240, 50, 25);

        JComboBox<String> mySubject3 = getComboBox(70,300);
        JLabel subjectLabel3 = getLabel("(Subject III)",70,275,2,12);
        JLabel gradeLabel3 = getLabel("(Grade III)",380,275,2,10);
        JTextField myGrade3 = getTextField(380,300, 50, 25);

        JComboBox<String> mySubject4 = getComboBox(70,360);
        JLabel subjectLabel4 = getLabel("(Subject IV)",70,335,2,12);
        JLabel gradeLabel4 = getLabel("(Grade IV)",380,335,2,10);
        JTextField myGrade4 = getTextField(380,360, 50, 25);

        JComboBox<String> mySubject5 = getComboBox(70,420);
        JLabel subjectLabel5 = getLabel("(Subject V)",70,395,2,12);
        JLabel gradeLabel5 = getLabel("(Grade V)",380,395,2,10);
        JTextField myGrade5 = getTextField(380,420, 50, 25);

        JComboBox<String> mySubject6 = getComboBox(70,480);
        JLabel subjectLabel6 = getLabel("(Subject VI)",70,455,2,12);
        JLabel gradeLabel6 = getLabel("(Grade VI)",380,455,2,10);
        JTextField myGrade6 = getTextField(380,480, 50, 25);

        JComboBox<String> mySubject7 = getComboBox(70,540);
        JLabel subjectLabel7 = getLabel("(Subject VII)",70,515,2,12);
        JLabel gradeLabel7 = getLabel("(Grade VII)",380,515,2,10);
        JTextField myGrade7 = getTextField(380,540, 50, 25);

        JButton myButton1 = getSelection("Average", 70,620);
        JButton myButton2 = getSelection("Revert", 285,620);

        this.add(myButton1);        this.add(myButton2);
        this.add(myGrade7);         this.add(gradeLabel7);      this.add(subjectLabel7);    this.add(mySubject7);
        this.add(myGrade6);         this.add(gradeLabel6);      this.add(subjectLabel6);    this.add(mySubject6);
        this.add(myGrade5);         this.add(gradeLabel5);      this.add(subjectLabel5);    this.add(mySubject5);
        this.add(myGrade4);         this.add(gradeLabel4);      this.add(subjectLabel4);    this.add(mySubject4);
        this.add(myGrade3);         this.add(gradeLabel3);      this.add(subjectLabel3);    this.add(mySubject3);
        this.add(myGrade2);         this.add(gradeLabel2);      this.add(subjectLabel2);    this.add(mySubject2);
        this.add(myGrade1);         this.add(gradeLabel1);      this.add(subjectLabel1);    this.add(mySubject1);
        this.add(sectionLabel);     this.add(sectionField);     this.add(nameLabel);        this.add(nameField);
    }

    public JLabel getLabel(String text, int horizontalAlignment, int verticalAlignment, int myFont, int fontSize) {   //The arguments must be static
        JLabel label = new JLabel(text);
        label.setFont(new Font(c.getLabelFont(), myFont, fontSize));
        label.setBounds(horizontalAlignment, verticalAlignment, c.getLabelWidth(),c.getLabelHeight()); 
        return label;
    }

    public JTextField getTextField(int horizontalAlignment, int verticalAlignment, int width, int height) {    //The arguments must be static
        JTextField textField = new JTextField();
        textField.setBounds(horizontalAlignment, verticalAlignment, width, height);  
        return textField;   
    }

    public JComboBox<String> getComboBox(int horizontalAlignment, int verticalAlignment) {
        JComboBox<String> mySubjects = new JComboBox<>(c.getListOfSubjects());
        mySubjects.setBounds(horizontalAlignment, verticalAlignment, c.getComboWidth(), c.getComboHeight()); 
        return mySubjects;
    }

    public JButton getSelection(String text, int horizontalAlignment, int verticalAlignment) {
        JButton selection = new JButton(text);
        selection.setBounds(horizontalAlignment, verticalAlignment, c.getButtonWidth(),c.getButtonHeight()); 
        selection.setFocusable(false);
        return selection;
    }

}
