package softeng211.chapter6.pathexistence;

import softeng211.graphmaker.Edge;
import softeng211.graphmaker.Vertex;

import java.util.ArrayList;
import java.util.List;

/**
 * This class checks if a path exists or not given vertices, edges, starting vertex and ending vertex.
 * This uses the path existence algorithm on pg65 of Lectures on Discrete Mathematics for Computer Science.
 * The algorithm is stated as follows:
 *
 *  PathExistence(G,s,t)
 *      1) Mark s as visited
 *      2) Repeat until no more vertices can be marked
 *          a) Iterate through all edges. If an edge (u,v) is found, such that u is marked and v is noot, then mark v as visited.
 *      3) If t is marked visited then report yes and stop. Otherwise, report no and stop.
 *
 *  NOTE: G is the given graph, s is the starting vertex and t is the ending vertex.
 *
 * @author Brian Nguyen
 */
public class CheckPathExistence {
    private List<Vertex> _vertices;
    private List<Edge> _edges;
    public CheckPathExistence(List<Vertex> vertices, List<Edge> edges) {
        _vertices = new ArrayList<>(vertices);
        _edges = new ArrayList<>(edges);
    }

    /**
     * Checks if there exists a path from starting vertex to ending vertex
     * @param startingVertex
     * @param endingVertex
     */
    public void check(int startingVertex, int endingVertex) {
        //Check if the user entered correct vertex values
        if (endingVertex > _vertices.size() || startingVertex < 0) {
            System.out.println("Exceeded the boundary.");
            return;
        }

        if (startingVertex == endingVertex) {
            System.out.println("Path exists");
        }
        _vertices.get(startingVertex).setVisited(true);
        List<Vertex> neighbours = getNeighbours(_vertices.get(startingVertex));
        checkNeighbours(neighbours);
        if (_vertices.get(endingVertex).isVisited()) {
            System.out.println("Path exists.");
        } else {
            System.out.println("Path does not exist.");
        }

    }

    /**
     * Recursively checks if the neighbours of a node. Then marks it as visited
     * @param neighbours
     */
    private void checkNeighbours(List<Vertex> neighbours) {
        for (Vertex vertex : neighbours) {
            if (vertex.isVisited()) {
                continue;
            }
            vertex.setVisited(true);
            if (getNeighbours(vertex).size() > 1) {
                checkNeighbours(getNeighbours(vertex));
            }

        }
    }

    /**
     * Retrieves the neighbours of a vertex
     * @param vertex
     * @return
     */
    private List<Vertex> getNeighbours(Vertex vertex) {
        List<Vertex> adjacentVertices = new ArrayList<>();
        for (Edge edge : _edges) {
            if (edge.getStartingVertex().equals(vertex)) {
                adjacentVertices.add(edge.getEndingVertex());
            } else if (edge.getEndingVertex().equals(vertex)) {
                adjacentVertices.add(edge.getStartingVertex());
            }
        }
        return adjacentVertices;
    }

    /**
     * @return the new set of vertices
     * TODO: Possibly change the colour
     */
    public List<Vertex> getNewVertices() {
        return _vertices;
    }

    /**
     * @return the new set of edges
     * TODO: Possibly change the colour
     */
    public List<Edge> getNewEdges() {
        return _edges;
    }
}
