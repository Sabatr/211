package softeng211.graphmaker;

/**
 * This class represents a vertex.
 * NOTE: A vertex is a representation of something. It has a position and a size.
 *
 * @author Brian Nguyen
 */
public class Vertex {
    public final static int NODE_SIZE = 50;
    private int _x;
    private int _y;
    private boolean _isEven = false;
    public Vertex(int x, int y) {
        _x = x;
        _y = y;
    }

    /**
     * @return the x position of a vertex
     */
    public int getX() {
        return _x;
    }

    /**
     * @return the y position of a vertex
     */
    public int getY() {
        return _y;
    }

    /**
     * Overrides the equals method to compare to vertex objects.
     * @param vertex
     * @return
     */
    public boolean equals(Vertex vertex) {
        if (this.toString().equals(vertex.toString())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets the degree of a vertex
     * @param isEven
     */
    public void setEven(boolean isEven) {
        _isEven = isEven;
    }

    /**
     * @return if the vertex is of even degree
     */
    public boolean isEven() {
        return _isEven;
    }
}
