import java.awt.Color;

public class UIConstant {

    //Frame
    private final int FRAME_WIDTH;
    private final int FRAME_HEIGHT;
    private final String FRAME_TITLE;
    private final Color FRAME_COLOR;    

    //Label
    private final String LABEL_FONT;
    private final int LABEL_WIDTH;
    private final int LABEL_HEIGHT;

    //Combo box
    private final String ListOfSubjects[];
    private final int COMBO_WIDTH;
    private final int COMBO_HEIGHT;

    //Button
    private final int BUTTON_WIDTH;
    private final int BUTTON_HEIGHT;

    UIConstant() {
        //FRAME CONSTANTS
        this.FRAME_WIDTH = 530;
        this.FRAME_HEIGHT = 770;
        this.FRAME_TITLE = "Grading Calculator";
        this.FRAME_COLOR = new Color(204,204,196);

        //LABEL CONSTANTS
        this.LABEL_FONT = "Dialog";
        this.LABEL_WIDTH = 150;
        this.LABEL_HEIGHT = 30;

        //COMBOBOX CONSTANTS
        this.ListOfSubjects = new String[] 
            {"(Select Subject)", 
            "Science Technology and Society", 
            "Ethics I", 
            "Art Appreciation", 
            "System Administration and Maintenance",
            "Discrete Structure", 
            "Mathematics in the Modern World",
            "Computer Programming II"}; 
        this.COMBO_WIDTH = 275;
        this.COMBO_HEIGHT = 25;

        //BUTTON CONSTANTS
        this.BUTTON_WIDTH = 150;
        this.BUTTON_HEIGHT = 30;
    }

    //Frame Getters
    public int getFrameWidth() {return FRAME_WIDTH;}
    public int getFrameHeight() {return FRAME_HEIGHT;}
    public String getFrameTitle() {return FRAME_TITLE;}
    public Color getFrameColor() {return FRAME_COLOR;}

    //Label Getters
    public String getLabelFont() {return LABEL_FONT;}
    public int getLabelWidth() {return LABEL_WIDTH;}
    public int getLabelHeight() {return LABEL_HEIGHT;}

    //Combo Box
    public String[] getListOfSubjects() {return ListOfSubjects;}
    public int getComboWidth() {return COMBO_WIDTH;}
    public int getComboHeight() {return COMBO_HEIGHT;}

    //Button
    public int getButtonWidth() {return BUTTON_WIDTH;}
    public int getButtonHeight() {return BUTTON_HEIGHT;}
    
}