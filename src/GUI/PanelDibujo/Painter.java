package GUI.PanelDibujo;
// Fig. 12.35: Painter.java
// DrawPanel test.
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter {
    public static void main(String[] args) {
        // create JFrame object
        JFrame application = new JFrame("A simple drawing program");

        DrawingPanel drawingPanel = new DrawingPanel();
        application.add(drawingPanel, BorderLayout.CENTER);

        // create a label and place it in the SOUTH region of the BorderLayout
        application.add(new JLabel("Drag mouse to draw"), BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 200);
        application.setVisible(true);
    }
}