package GUI.MarcoBotonOption;
// Fig. 12.20: OptionButtonTest.java
// OptionButtonFrame test.
import javax.swing.JFrame;

public class OptionButtonTest{
        public static void main(String[] args){
            MarcoBotonOpcion marcoBotonOpcion = new MarcoBotonOpcion();
            marcoBotonOpcion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marcoBotonOpcion.setSize(300, 100);
            marcoBotonOpcion.setVisible(true);
        }
} // end class OptionButtonTest