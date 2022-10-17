package GUI.MarcoBoton;
// Fig. 12.16: TestButton.java
// ButtonFrame test.
import javax.swing.JFrame;

public class TestButton {
        public static void main(String[] args){
            FrameButton ButtonFrame = new FrameButton();
            ButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ButtonFrame.setSize(275, 110);
            ButtonFrame.setVisible(true);
        }
} // end of the TestButton class