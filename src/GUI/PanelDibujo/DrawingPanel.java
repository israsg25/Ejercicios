package GUI.PanelDibujo;
// Fig. 12.35: Painter.java
// DrawPanel test.
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
    // list of Point references
    private final ArrayList<Point> points = new ArrayList<>();

    // set the GUI and register the mouse event handler
    public DrawingPanel() {
        // handle mouse move event on frame
        addMouseMotionListener(
                new MouseMotionAdapter() {
                    // store drag coordinates and redraw
                    @Override
                    public void mouseDragged(MouseEvent event) {
                        points.add(event.getPoint());
                        repaint();
                    }
                }
        );
    }
    // draw ovals in a 4 x 4 bounding box, at specified locations in the window
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // clear the drawing area

        // draw all points
        for (Point point : points) {
            g.fillOval(point.x, point.y, 4, 4);
        }
    }
}// end class DrawingPanel