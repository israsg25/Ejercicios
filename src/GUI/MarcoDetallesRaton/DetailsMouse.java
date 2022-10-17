package GUI.MarcoDetallesRaton;
// Fig. 12.32: MouseDetails.java
// MouseDetailFrame test.
import javax.swing.JFrame;

public class DetailsMouse {
    public static void main(String[] args) {
        MouseDetailsFrame mouseDetailFrame = new MouseDetailsFrame();
        mouseDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseDetailFrame.setSize(400,150);
        mouseDetailFrame.setVisible(true);
    }
}// end class MouseDetails
