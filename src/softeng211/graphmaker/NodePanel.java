package softeng211.graphmaker;


import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * This is the panel where the graph is drawn on.
 *
 * @author Brian Nguyen
 */
public class NodePanel extends JPanel {
    private List<Vertex> _vertices;
    private List<Edge> _edges;
    public NodePanel(List<Vertex> vertices, List<Edge> edges) {
        _vertices = vertices;
        _edges = edges;
    }

    /**
     * Draws the vertices and edges on the frame.
     * @param g
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int i = 0;
        for (Vertex vertex: _vertices) {
            g.setColor(vertex.getColour());
            g.drawOval(vertex.getX(),vertex.getY(),Vertex.NODE_SIZE,Vertex.NODE_SIZE);
            g.drawString(i+"", vertex.getX(),vertex.getY());
            i++;
        }

        for (Edge edge : _edges) {
            g.setColor(edge.getColour());
            g.drawLine(edge.getStartingVertex().getX()+Vertex.NODE_SIZE/2,edge.getStartingVertex().getY()+Vertex.NODE_SIZE/2,
                    edge.getEndingVertex().getX()+Vertex.NODE_SIZE/2,edge.getEndingVertex().getY()+Vertex.NODE_SIZE/2);
        }
    }

}
