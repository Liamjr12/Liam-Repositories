package JavaSwing;

import java.awt.Color;
import java.awt.Font;

public class SwingAttributes {
    private int x;
    private int y;
    private int outerPanelGap;
    private String title;
    private String inText;
    private Color frameColor;
    private Font labelFont;
    private int horizontalBounds;
    private int verticalBounds;

    SwingAttributes() {
        this.x = 750;
        this.y = 625;
        this.horizontalBounds = 10;
        this.verticalBounds = 10;
        this.outerPanelGap = 5;
        this.title = "The Colors";
        this.inText = "Hello World!";
        this.frameColor = Color.WHITE;
        this.labelFont = new Font("DialogInput", Font.BOLD, 36);
    }

    //Getter methods
    public int getWidth() {return x;}
    public int getHeight() {return y;}
    public int getOuterPanelGap() {return outerPanelGap;}
    public String getTitle() {return title;}
    public String getInText() {return inText;}
    public Color getFrameColor() {return frameColor;}
    public Font getLabelFont() {return labelFont;}
    public int getHorizontalBounds() {return horizontalBounds;}
    public int getVerticalBounds() {return verticalBounds;}
}
