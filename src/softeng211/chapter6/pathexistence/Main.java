package softeng211.chapter6.pathexistence;

import softeng211.graphmaker.Graph;

/**
 * This is an exercise from Lectures on Discrete Mathematics for Computer Science.
 * Given a graph g, check whether a path exists from one vertex to another.
 *
 * @author Brian Nguyen
 */
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.makeRandomGraph(5,3);
        CheckPathExistence checker = new CheckPathExistence(graph.getVertices(),graph.getEdges());
        checker.check(1,2);
        graph.update(checker.getNewVertices(),checker.getNewEdges());
    }
}
