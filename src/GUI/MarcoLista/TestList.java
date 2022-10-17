package GUI.MarcoLista;
// Fig. 12.24: TestList.java
// Select colors from a JList object
import  javax.swing.JFrame;

public class TestList {
    public static void main(String[] args) {
        ListFrame listFrame= new ListFrame();//create ListFrame object
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listFrame.setSize(800,600);
        listFrame.setVisible(true);
    }
}