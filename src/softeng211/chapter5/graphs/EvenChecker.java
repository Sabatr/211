package softeng211.chapter5.graphs;

import softeng211.graphmaker.Edge;
import softeng211.graphmaker.Vertex;

import java.util.ArrayList;
import java.util.List;

/**
 * This class checks if vertices are of even degree. (This means it has an even number of neighbours)
 *
 * @author Brian Nguyen
 */
public class EvenChecker {
    private List<Vertex> _vertices;
    private List<Edge> _edges;
    public EvenChecker(List<Vertex> vertices, List<Edge> edges) {
        _vertices = new ArrayList<>(vertices);
        _edges = new ArrayList<>(edges);
    }

    /**
     * Counts the number of occurrences of a vertex exists in an edge.
     * @return
     */
    public List<Vertex> checkEven() {
        for (Vertex vertex : _vertices) {
            int count = 0;
            for (Edge edge : _edges) {
                if (edge.getStartingVertex().equals(vertex) || edge.getEndingVertex().equals(vertex)) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                vertex.setEven(true);
            }
        }
        return _vertices;
    }
}
