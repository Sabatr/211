package softeng211.chapter5.adjacencylistandmatrix;

import java.util.List;

/**
 * This class displays a n x n adjacency matrix then converts it into it's corresponding adjacency list.
 * That adjacency list is then converted back into an adjacency matrix. The resulting adjacency matrix and the
 * original should be exactly the same.
 *
 * This is an exercise from the book Lectures on Discrete Mathematics for Computer Science, pg 61.
 *
 * @author Brian Nguyen
 */
public class Main {
    public static void main(String[] args) {
        int[][] adjacencyMatrix = new CreateAdjacencyMatrix().create(5,5);
        List<List<Integer>> list = new AdjacencyConverter().convertToList(adjacencyMatrix);
        System.out.println(list);

        int[][] newAdjacencyMatrix = new AdjacencyConverter().convertToMatrix(list);
        new CreateAdjacencyMatrix().printOutMatrix(newAdjacencyMatrix);
    }
}
