package softeng211.chapter5.adjacencylistandmatrix;

/**
 * This class randomly generates an adjacency matrix for a given row and column
 *
 * @author Brian Nguyen
 */
public class CreateAdjacencyMatrix {
    public int[][] create(int row, int column) {
        int[][] array = new int[row][column];
        for (int i=0; i<row;i++) {
            for (int j=0; j<column;j++) {
                if (Math.random() <= 0.5) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println("For adjacency matrix: ");
        printOutMatrix(array);
        return array;
    }

    /**
     * Prints out the matrix.
     * @param matrix
     */
    public void printOutMatrix(int[][] matrix) {
        for (int i =0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
