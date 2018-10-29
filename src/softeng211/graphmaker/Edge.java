package softeng211.graphmaker;

/**
 * This class represents an edge.
 * NOTE: An edge is a connection between two vertices. An edge is defined as (u,v) where u and v are vertices.
 *
 * @author Brian Nguyen
 */
public class Edge {
    private Vertex _startingVertex;
    private Vertex _endingVertex;
    public Edge(Vertex startingVertex, Vertex endingVertex) {
        _startingVertex = startingVertex;
        _endingVertex = endingVertex;
    }

    public Vertex getStartingVertex() {
        return _startingVertex;
    }

    public Vertex getEndingVertex() {
        return _endingVertex;
    }
}
