package softeng211.graphmaker;

import java.util.ArrayList;

/**
 * Creates a tree graph. Each node can have at most 3 children.
 * NOTE: This does not represent all possible tree's with at most 3 children since once the parent has a children,
 * the other children on the same level cannot have a child.
 *
 * @author Brian Nguyen
 */
public class TreeGraph extends Graph {
    private enum position {LEFT,RIGHT,CENTER}
    private position _currentPosition = position.LEFT;
    private int _depth = 0;
    private int _alignment = 0;
    private Vertex _parentVertex;
    public void makeRandomTreeGraph(int numberOfVertices) {
        int children = 0;
        super._vertices = new ArrayList<>();
        super._edges = new ArrayList<>();
        for (int i = 0; i < numberOfVertices ; i++) {
            //The root is at the same position every time
            if (i == 0) {
                _vertices.add(new Vertex(Graph.FRAME_WIDTH/2-Vertex.NODE_SIZE/2,Vertex.NODE_SIZE+_depth));
                _parentVertex = _vertices.get(0);
                increaseDepth();
                continue;
            }

            //Randomly creates children for the parent node
            if (Math.random() < 0.4 || children == 3) {
                _parentVertex = _vertices.get(i-1);
                increaseDepth();
                _currentPosition = position.LEFT;
                changeAlignment();
                children = 0;
            } else {
                changeAlignment();
                children++;
            }
            _vertices.add(new Vertex(Graph.FRAME_WIDTH/2-Vertex.NODE_SIZE/2+_alignment,Vertex.NODE_SIZE+_depth));
            _edges.add(new Edge(_parentVertex,_vertices.get(i)));
        }

        super.makeGraph();
    }

    /**
     * The vertices are always positioned as left -> right -> center.
     */
    private void changeAlignment() {
        switch(_currentPosition) {
            case LEFT:
                _alignment-=70;
                _currentPosition = position.RIGHT;
                break;
            case RIGHT:
                _alignment+=140;
                _currentPosition = position.CENTER;
                break;
            case CENTER:
                _alignment = _parentVertex.getX()-Graph.FRAME_WIDTH/2+Vertex.NODE_SIZE/2;
                _currentPosition = position.LEFT;
                break;
        }
    }

    /**
     * Increase depth unless the depth is at the starting node.
     */
    private void increaseDepth() {
        if (_vertices.size() == 1 && _depth == 60) {
            return;
        } else {
            _depth+=60;
        }
    }
}
