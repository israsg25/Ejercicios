package GUI.MarcoPanel;
// Fig. 12.46: DemoPanel.java
// MarcoPanel test.
import javax.swing.JFrame;

public class DemoPanel {
    public static void main(String[] args)
    {
        FramePanel framePanel = new FramePanel();
        framePanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePanel.setSize(450, 200);
        framePanel.setVisible(true);
    }
} // end of DemoPanel class