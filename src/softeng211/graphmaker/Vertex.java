package softeng211.graphmaker;

import java.awt.*;

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
    private boolean _visited;
    private Color _colour;
    public Vertex(int x, int y) {
        _visited = false;
        _x = x;
        _y = y;
        _colour = Color.BLACK;
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
     * Sets the colour of a vertex
     * @param colour
     */
    public void setColour(Color colour) {
        _colour = colour;
    }

    /**
     * @return the colour of the vertex
     */
    public Color getColour() {
        return _colour;
    }

    public void setVisited(boolean visited) {
        _visited = visited;
    }

    public boolean isVisited() {
        return _visited;
    }
}
