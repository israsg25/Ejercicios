package GUI.MarcoBoton;
// Fig. 12.15: ButtonFrame.java
// Command buttons and action events.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class FrameButton extends JFrame{
    private final JButton buttonJButtonSimple; // button with text only
    private final JButton buttonJButtoElegant; // button with icons

    // ButtonFrame adds JButton objects to JFrame
    public FrameButton() {
        super("Button test");
        setLayout(new FlowLayout());

        buttonJButtonSimple = new JButton("Simple button"); // button with text
        add(buttonJButtonSimple); // add buttonJButtonSimple to JFrame

        Icon insect1 = new ImageIcon(getClass().getResource("insect1.gif"));
        Icon insect2 = new ImageIcon(getClass().getResource("insect2.gif"));
        buttonJButtoElegant = new JButton("Elegant button", insect1); // establishes the picture
        buttonJButtoElegant.setRolloverIcon(insect2); // set the image of substitution
        add(buttonJButtoElegant); // add fancyButtonJButton to JFrame

        // create new ButtonHandler to handle button events
        ButtonHandler handler = new ButtonHandler();
        buttonJButtoElegant.addActionListener(handler);
        buttonJButtonSimple.addActionListener(handler);
    }

    // inner class to handle button events
    private class ButtonHandler implements ActionListener{
        // handle button event
        @Override
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(FrameButton.this, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
} // end ButtonFrame class

