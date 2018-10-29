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
    public Vertex(int x, int y) {
        _x = x;
        _y = y;
    }

    public int getX() {
        return _x;
    }

    public int getY() {
        return _y;
    }

    public boolean equals(Vertex vertex) {
        if (this.toString().equals(vertex.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
