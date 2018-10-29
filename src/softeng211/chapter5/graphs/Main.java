package softeng211.chapter5.graphs;

import softeng211.graphmaker.Graph;

/**
 * This program gets a random graph and outputs all of the even degree vertices.
 * This was supposed to take in a digraph, but that's too complicated for the short time I have so it only works for
 * undirected graphs.
 *
 * @author Brian Ngyuen
 */
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.makeRandomGraph(5,7);
        graph.update(new EvenChecker(graph.getVertices(),graph.getEdges()).checkEven());
    }
}
