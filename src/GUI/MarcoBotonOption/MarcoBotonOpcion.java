package GUI.MarcoBotonOption;
// Fig. 12.19: OptionButtonFrame.java
// Create radio buttons, using ButtonGroup and JRadioButton.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
public class MarcoBotonOpcion extends JFrame{
    private final JTextField textField; // is used to show the changes in the font
    private final Font simpleLetterType; // font for plain text
    private final Font BoldLetterType; // font for bold text
    private final Font typeItalic; // font for italic text
    private final Font fontBoldItalic; // font for text in bold and italic
    private final JRadioButton simpleJRadioButton; // select plain text
    private final JRadioButton boldJRadioButton; // select bold text
    private final JRadioButton italicsJRadioButton; // select italic text
    private final JRadioButton boldItalicJRadioButton; // bold and italic
    private ButtonGroup OptionsGroup; // contains the radio buttons

    // The constructor of OptionButtonFrame adds the JRadioButton objects to the JFrame
    public MarcoBotonOpcion(){
        super("RadioButton test");
        setLayout(new FlowLayout());

        textField = new JTextField("Notice the change in font style", 25);
        add(textField); // add TextField to JFrame

        // create the radio buttons
        simpleJRadioButton = new JRadioButton("Simple", true);
        boldJRadioButton = new JRadioButton("Bold", false);
        italicsJRadioButton = new JRadioButton("Italic", false);
        boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
        add(simpleJRadioButton); // add simple button to JFrame
        add(boldJRadioButton); // add bold button to JFrame
        add(italicsJRadioButton); // add italics button to JFrame
        add(boldItalicJRadioButton); // add bold and italic button

        // create a logical relationship between the JRadioButton objects
        OptionsGroup = new ButtonGroup(); // create ButtonGroup
        OptionsGroup.add(simpleJRadioButton); // add simple to the group
        OptionsGroup.add(boldJRadioButton); // add bold to the group
        OptionsGroup.add(italicsJRadioButton); // add italics to the group
        OptionsGroup.add(boldItalicJRadioButton); // add bold and italics fifty
        // create font objects
        simpleLetterType = new Font("Serif", Font.PLAIN, 14);
        BoldLetterType = new Font("Serif", Font.BOLD, 14);
        typeItalic = new Font("Serif", Font.ITALIC, 14);
        fontBoldItalic = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(simpleLetterType);

        // register events for JRadioButton objects
        simpleJRadioButton.addItemListener(
                new OptionButtonHandler(simpleLetterType));
        boldJRadioButton.addItemListener(
                new OptionButtonHandler(BoldLetterType));
        italicsJRadioButton.addItemListener(
                new OptionButtonHandler(typeItalic));
        boldItalicJRadioButton.addItemListener(
                new OptionButtonHandler(BoldLetterType));
    }

    // private inner class to handle radio button events
    private class OptionButtonHandler implements ItemListener{
        private Font FontType; // font associated with this component listening
        public OptionButtonHandler(Font f){
             FontType = f;
        }

        // handle radio button events
        @Override
        public void itemStateChanged(ItemEvent event){
            textField.setFont(FontType);
            }
    }
} // end class OptionButtonFrame



