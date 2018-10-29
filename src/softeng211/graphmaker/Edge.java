package softeng211.graphmaker;

import java.awt.*;

/**
 * This class represents an edge.
 * NOTE: An edge is a connection between two vertices. An edge is defined as (u,v) where u and v are vertices.
 *
 * @author Brian Nguyen
 */
public class Edge {
    private Vertex _startingVertex;
    private Vertex _endingVertex;
    private Color _edgeColour;
    public Edge(Vertex startingVertex, Vertex endingVertex) {
        _startingVertex = startingVertex;
        _endingVertex = endingVertex;
        _edgeColour = Color.black;
    }

    public Vertex getStartingVertex() {
        return _startingVertex;
    }

    public Vertex getEndingVertex() {
        return _endingVertex;
    }

    public Color getColour() {
        return _edgeColour;
    }

    public void setColour(Color colour) {
        _edgeColour = colour;
    }
}
