package GUI.MarcoRastreadorRaton;
// Fig. 12.29: MouseTrackerFrame.java
// Test of MouseTrackerFrame.
import javax.swing.JFrame;

public class MouseTracker {
    public static void main(String[] args) {
        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(300, 100);
        mouseTrackerFrame.setVisible(true);
    }
}// end class TrackerMouse
