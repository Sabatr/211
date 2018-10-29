package softeng211.graphmaker;

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
