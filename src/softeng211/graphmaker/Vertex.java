package softeng211.graphmaker;

public class Vertex {
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
