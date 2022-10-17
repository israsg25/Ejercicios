package GUI.MarcoSeleccionMultiple;
// Fig. 12.25: MultipleSelectionFrame.java
// JList object that allows multiple selections.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

// JList object that allows multiple selections.
public class MultipleSelectionFrame extends JFrame {
    private final JList<String> listJListColors;// list to store names of the colors
    private final JList<String> listJListCopy;// list to copy to the names of the colors
    private JButton buttonJButtonCopy;// button to copy selected names
    private static final String[] colorsName = {"Black", "Blue", "Cyan",
            "Dark gray", "Gray", "Green", "Light gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow"};

    // Multiple Selection Frame Constructor
    public MultipleSelectionFrame() {
        super("Multiple choice lists");
        setLayout(new FlowLayout());
        listJListColors = new JList<String>(colorsName);// List of names of colors
        listJListColors.setVisibleRowCount(5);// show five rows
        listJListColors.setSelectionMode(
                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(listJListColors));// add list with panel displacement
        buttonJButtonCopy = new JButton("Copy >>>");
        buttonJButtonCopy.addActionListener(new ActionListener() {// anonymous inner class
                                                // handle button event
                                                @Override
                                                public void actionPerformed(ActionEvent event) {
                                                    // put the selected values in listJListCopy
                                                    listJListCopy.setListData(listJListColors.getSelectedValuesList().toArray(new String[0]));
                                                }
                                            }
        );
        add(buttonJButtonCopy);// add copy button to JFrame
        listJListCopy = new JList<String>();// list to store names of copied colors
        listJListCopy.setVisibleRowCount(5);// show 5 rows
        listJListCopy.setFixedCellWidth(100);// set the width
        listJListCopy.setFixedCellHeight(15);// set the height
        listJListCopy.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(listJListCopy));// add list with panel displacement
    }
}// end class MultiSelectionFrame