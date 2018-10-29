package softeng211.chapter5.adjacencylistandmatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * This class converts an adjacency matrix to an adjacency list or it converts an adjacency list to an adjacency matrix.
 *
 * @author Brian Nguyeh
 */
public class AdjacencyConverter {
    public List<List<Integer>> convertToList(int[][] adjacencyMatrix) {
        List<List<Integer>> linkedList = new ArrayList<>();
        for (int i = 0; i<adjacencyMatrix.length;i++) {
            //The first value represents the row position from the adjacency matrix.
            linkedList.add(new ArrayList<>());
            linkedList.get(i).add(i);
        }
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0 ; j < adjacencyMatrix[0].length ; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    linkedList.get(i).add(j);
                }
            }
        }
        return linkedList;
    }

    public int[][] convertToMatrix(List<List<Integer>> adjacencyList ) {
        int rowNumber = 0;
        int largestSize = adjacencyList.size();
        for (List<Integer> list : adjacencyList) {
            if (list.size() > largestSize) {
                largestSize = list.size();
            }
        }
        int[][] adjacencyMatrix = new int[adjacencyList.size()][largestSize+1];
        for (List<Integer> list : adjacencyList) {
            int pos = 0;
            for (Integer value: list) {
                if (pos != 0) {
                    adjacencyMatrix[rowNumber][value] = 1;
                }
                pos++;
            }
            rowNumber++;
        }
        return adjacencyMatrix;
    }
}
