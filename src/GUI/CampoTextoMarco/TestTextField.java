package GUI.CampoTextoMarco;
// Fig. 12.10: TextFieldTest.java
// Test FrameTextField.
import javax.swing.JFrame;

public class TestTextField {
        public static void main(String[] args) {
            FieldTextFrame  frameTextField= new FieldTextFrame();
            frameTextField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frameTextField.setSize(350, 100);
            frameTextField.setVisible(true);
        }
} // end class TextFieldTest