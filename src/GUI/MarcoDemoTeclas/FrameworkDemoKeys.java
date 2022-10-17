package GUI.MarcoDemoTeclas;
// Fig. 12.36: KeyDemoFrame.java
// Handling key events.
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FrameworkDemoKeys extends JFrame implements KeyListener {
    private String line1 = ""; // first line of the textarea
    private String line2 = ""; // second line of the textarea
    private String line3 = ""; // third line of the textarea
    private JTextArea TextArea; // textarea to display the output

    public FrameworkDemoKeys() {
        super("Demonstration of key press events");

        TextArea = new JTextArea(10, 15); // set the JTextArea object
        TextArea.setText("Press any key on the keyboard...");
        TextArea.setEnabled(false);
        TextArea.setDisabledTextColor(Color.BLACK);
        add(TextArea); // add the textarea to JFrame

        addKeyListener(this); // allows the framework to process key events
    }

    // handle the event of pressing any key
    @Override
    public void keyPressed(KeyEvent event) {
        line1 = String.format("Key pressed: %s", KeyEvent.getKeyText(event.getKeyCode())); // show the key pressed
        setLines2and3(event); // set output lines two and three
    }

    // handle the event of releasing any key
    @Override
    public void keyReleased(KeyEvent event) {
        line1 = String.format("Key released: %s", KeyEvent.getKeyText(event.getKeyCode())); // show the released key
        setLines2and3(event); // set output lines two and three
    }

    @Override
    public void keyTyped(KeyEvent event) {
        line1 = String.format("Key pressed: %s", event.getKeyChar());
        setLines2and3(event); // set output lines two and three
    }

    // set output lines two and three
    private void setLines2and3(KeyEvent event) {
        line2 = String.format("This key %s is an action key", (event.isActionKey() ? "" : "no "));

        String temp = KeyEvent.getKeyModifiersText(event.getModifiers());

        line3 = String.format("Modifier keys pressed: %s", (temp.equals("") ? "none" : temp)); // print modifiers

        TextArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3)); // print three lines of text
    }
}// end class KeyDemoFrame