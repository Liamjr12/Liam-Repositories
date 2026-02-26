package Test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.Font;
import java.awt.Color;

public class LayeredPane {

    private JLayeredPane layer;
    private JFrame frame;

    LayeredPane() {
        frame = new JFrame("LayeredPane");
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.add(frameLayer());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public JLayeredPane frameLayer() {
        layer = new JLayeredPane();
        layer.setLayout(null);
        layer.setBounds(0, 0, 500, 500);
        layer.setBackground(Color.CYAN);
        layer.setOpaque(true);
        layer.add(defaultLayer(), JLayeredPane.DEFAULT_LAYER);
        layer.add(paletteLayer(), JLayeredPane.PALETTE_LAYER);
        layer.add(modalLabel(), JLayeredPane.MODAL_LAYER);
        layer.add(popupLabel(), JLayeredPane.POPUP_LAYER);
        layer.add(dragLayer(), JLayeredPane.DRAG_LAYER);
        return layer;
    }

    public JLabel defaultLayer() {
        JLabel label1 = new JLabel("This is Default layer");
        label1.setFont(new Font("DialogInput", Font.BOLD, 12));
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setForeground(Color.WHITE);
        label1.setBounds(10, 10, 200, 200);
        return label1;
    }

    public JLabel paletteLayer() {
        JLabel label2 = new JLabel("This is Palette layer");
        label2.setFont(new Font("DialogInput", Font.BOLD, 12));
        label2.setOpaque(true);
        label2.setBackground(Color.ORANGE);
        label2.setForeground(Color.WHITE);
        label2.setBounds(40, 40, 200, 200);
        return label2;
    }

    public JLabel modalLabel() {
        JLabel modalLabel = new JLabel("This is Modal layer");
        modalLabel.setFont(new Font("DialogInput", Font.BOLD, 12));
        modalLabel.setOpaque(true);
        modalLabel.setBackground(Color.YELLOW);
        modalLabel.setForeground(Color.WHITE);
        modalLabel.setBounds(70, 70, 200, 200);
        return modalLabel;
    }

    public JLabel popupLabel() {
        JLabel popupLabel = new JLabel("This is Popup layer");
        popupLabel.setFont(new Font("DialogInput", Font.BOLD, 12));
        popupLabel.setOpaque(true);
        popupLabel.setBackground(Color.GREEN);
        popupLabel.setForeground(Color.WHITE);
        popupLabel.setBounds(100, 100, 200, 200);
        return popupLabel;
    }

    public JLabel dragLayer() {
        JLabel dragLabel = new JLabel("This is Drag layer");
        dragLabel.setFont(new Font("DialogInput", Font.BOLD, 12));
        dragLabel.setOpaque(true);
        dragLabel.setBackground(Color.BLUE);
        dragLabel.setForeground(Color.WHITE);
        dragLabel.setBounds(130, 130, 200, 200);
        return dragLabel;
    }

    public static void main(String args[]) {
       new LayeredPane();
    }
}
