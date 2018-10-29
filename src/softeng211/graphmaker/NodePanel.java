package softeng211.graphmaker;


import javax.swing.*;
import java.awt.*;
import java.util.List;

public class NodePanel extends JPanel {
    private final int NODESIZE = 50;
    private List<Vertex> _vertices;
    private List<Edge> _edges;
    public NodePanel(List<Vertex> vertices, List<Edge> edges) {
        _vertices = vertices;
        _edges = edges;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Vertex vertex: _vertices) {
            g.drawOval(vertex.getX(),vertex.getY(),NODESIZE,NODESIZE);
        }

        for (Edge edge : _edges) {
            g.drawLine(edge.getStartingVertex().getX()+NODESIZE/2,edge.getStartingVertex().getY()+NODESIZE/2,
                    edge.getEndingVertex().getX()+NODESIZE/2,edge.getEndingVertex().getY()+NODESIZE/2);
        }

    }

    public void test() {
        this.getGraphics();
    }
}
