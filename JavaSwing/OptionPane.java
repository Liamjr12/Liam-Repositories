package Test;

import javax.swing.JOptionPane;

public class OptionPane{

	public static void main(String[] args) {

        getOptionPane();
			
	}

    public static void getOptionPane() {
        String option[] = {"Yes", "No"};
        int answer = -1;   
        while (answer != 0) {
            answer = JOptionPane.showOptionDialog(
            null, 
            "Will you be my date?", 
            "Secret message for you", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null,
            option, 
            null);
     
        }
        System.out.println("She said yes!");
    }

}
