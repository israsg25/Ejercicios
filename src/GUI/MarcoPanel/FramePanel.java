package GUI.MarcoPanel;
// Fig. 12.45: FramePanel.java
// Use of a JPanel object to help layout components.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class FramePanel  extends  JFrame{
    private final JPanel buttonPanel ; // Panel containing the buttons
    private final JButton[] buttons;

    // Constructor with no arguments
    public FramePanel() {
        super( "Demo Panel" );
        buttons = new JButton[ 5 ];
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout ( 1 , buttons . length ));

        // Create and add buttons
        for ( int count = 0 ; count < buttons . length ; count ++) {
            buttons [ count ] = new JButton ( "Button" + ( count + 1 ));
            buttonPanel.add(buttons[count]); // Add the button to the panel
        }
        add(buttonPanel, BorderLayout .SOUTH ); // Add panel to JFrame
    }
} // end the FramePanel class