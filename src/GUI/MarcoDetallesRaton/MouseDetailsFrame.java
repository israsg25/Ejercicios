package GUI.MarcoDetallesRaton;
// Fig. 12.31: MouseDetailFrame.java
// Demonstration of mouse clicks and how to differentiate between mouse buttons.
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame{
    private String details;//String shown in StatusBar
    private final JLabel statusBar;//JLabel that appears at the bottom of the window

    //constructor sets String of title bar and registers mouse listener component
    public MouseDetailsFrame() {
        super("Click and Mouse Buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler()); // add the handler
    }

    //inner class to handle mouse events
    private class MouseClickHandler extends MouseAdapter {
        //handle mouse click event and determine which button was pressed
        @Override
        public void mouseClicked(MouseEvent event) {
            int xPos = event.getX(); // Get the x position of the mouse
            int yPos = event.getY();//Gets the y position of the mouse

            details = String.format("Clicked %d time(s)",
                    event.getClickCount());

            if (event.isMetaDown())//right mouse button
                details += "with the right mouse button";
            else if (event.isAltDown())//middle mouse button
                details += "with the middle mouse button";
            else // left mouse button
                details += "with the left mouse button";

            statusBar.setText(details);//shows the message in statusbar

        }
    }
}// end class MouseDetailFrame