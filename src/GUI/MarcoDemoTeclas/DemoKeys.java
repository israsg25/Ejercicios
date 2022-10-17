package GUI.MarcoDemoTeclas;
// Fig. 12.37: KeyDemo.java
// KeyDemoFrame test.
import javax.swing.JFrame;

public class DemoKeys {
    public static void main(String[] args) {
        FrameworkDemoKeys frameworkDemoKeys= new FrameworkDemoKeys();
        frameworkDemoKeys.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameworkDemoKeys.setSize(350, 100);
        frameworkDemoKeys.setVisible(true);
    }
}// end of KeyDemo class