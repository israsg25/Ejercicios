package GUI.MarcoBorderLayout;
// Fig. 12.42: DemoBorderLayout.java
// Test of FrameBorderLayout.
import javax.swing.JFrame;

public class DemoBorderLayout {
    public static void main(String[] args) {
        BorderLayoutFramework borderLayoutFramework= new BorderLayoutFramework();
        borderLayoutFramework.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFramework.setSize(300, 200);
        borderLayoutFramework.setVisible(true);
    }
} // end of DemoBorderLayout class