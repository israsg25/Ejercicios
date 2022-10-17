package GUI.CampoTextoMarco;
// Fig. 12.9: FrameTextField.java
// The JTextField and JPasswordField components.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class FieldTextFrame extends JFrame {
    private final JTextField textField1; // text field with fixed size
    private final JTextField textField2; // text field with text
    private final JTextField textField3; // text field with text and size
    private final JPasswordField PasswordField; // password field with text

    // FrameTextField constructor adds JTextField objects to JFrame
    public FieldTextFrame(){
        super("JTextField and JPasswordField test");
        setLayout(new FlowLayout());

        // build text field with 10 columns
        textField1 = new JTextField(10);
        add(textField1); // add textField1 to JFrame

        // build text field with default text
        textField2 = new JTextField("Type the text here");
        add(textField2); // add textField2 to JFrame

        // build text field with default text and 21 columns
        textField3 = new JTextField("Text field not editable", 21);
        textField3.setEditable(false); // disable editing
        add(textField3); // add textField3 to JFrame

        // build password field with default text
        PasswordField = new JPasswordField("Hidden Text");
        add(PasswordField); // add PasswordField to JFrame

        // register event handlers
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        PasswordField.addActionListener(handler);
    }

    // private inner class for event handling
    private class TextFieldHandler implements ActionListener{
        // process text field events
        @Override
        public void actionPerformed(ActionEvent event){
            String string = "";

            // user pressed Enter on JTextField object textField1
            if (event.getSource() == textField1)
                string = String.format("textField1: %s",
            event.getActionCommand());

            // user pressed Enter on JTextField object textField2
            else if (event.getSource() == textField2)
                 string = String.format("textField2: %s",
            event.getActionCommand() );

            // the user pressed Enter on the JTextField object textField3
            else if (event.getSource() == textField3)
                string = String.format("textField3: %s",
            event.getActionCommand());

            // the user pressed Enter on the JTextField object PasswordField
            else if (event.getSource() == PasswordField)
                 string = String.format("Password field: %s",
            event.getActionCommand());

            // display the content of the JTextField object
            JOptionPane.showMessageDialog(null, string);
        }
    } // end private inner class TextFieldHandler
} // end class FrameTextField



