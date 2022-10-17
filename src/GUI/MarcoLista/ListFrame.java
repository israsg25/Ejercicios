package GUI.MarcoLista;
// Fig. 12.23: ListFrame.java
// JList object that displays a list of colors.
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame {
    private final JList<String> listJListColors; //ready to show colors
    private static final String[] nameColors ={"Black","Blue","Cyan","Dark Gray",
            "Gray","Green","Light gray","Magenta","Orange","Pink","Red","White","Yellow"};
    private static final Color[] colors={Color.BLACK,Color.BLUE,Color.CYAN,
            Color.DARK_GRAY,Color.GRAY,Color.GREEN,Color.LIGHT_GRAY, Color.MAGENTA,Color.ORANGE,Color.PINK,
            Color.RED,Color.WHITE,Color.YELLOW};

    //The constructor of ListFrame adds to the JFrame the JScrollPane that contains a JList
    public ListFrame(){
        super("JList test");
        setLayout(new FlowLayout());

        listJListColors = new JList<String>(nameColors);//list of names colors
        listJListColors.setVisibleRowCount(5);//show five rows at a time

        //does not allow multiple selections
        listJListColors.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //adds a JScrollPane object containing a JList to the frame
        add(new JScrollPane(listJListColors));

        listJListColors.addListSelectionListener(
                new ListSelectionListener(){ //handle list selection events
                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(colors[listJListColors.getSelectedIndex()]);
                    }
                }
        );
    }
}//end of class ListFrame