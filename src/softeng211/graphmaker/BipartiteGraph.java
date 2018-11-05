package softeng211.graphmaker;

import java.util.ArrayList;
import java.util.List;

/**
 * This class creates a random bipartite graph.
 * A bipartite graph is a graph consisting of two different "sides". OR more formally V = v1 U v2.
 * Where only v in v1 can point to v in v2 and vice versa.
 * TODO: Probably add arrows to make things look clearer.
 * TODO: Also, make arrows more further apart.
 *
 * @author Brian Nguyen
 */
public class BipartiteGraph extends Graph {
    private List<BipartiteVertex> _list;
    public BipartiteGraph() {
        _list = new ArrayList<>();
        _edges = new ArrayList<>();
    }
    public void makeRandomBipartiteGraph(int first,int second,int edgesOfFirst, int edgesOfSecond) {
        _list = populateBipartiteVertices(first,second);
        setFirstAndSecond(first,second);
        _vertices = new ArrayList<>(_list);
        //We want to make sure only the even numbers point to odd and odd points to even.
        for (int i = 0;i<edgesOfFirst;i++) {
            _edges.add(new Edge(_vertices.get((int)(Math.random()*first)),_vertices.get((int)(Math.random()*second)+first)));
        }

        for (int i = 0;i<edgesOfSecond;i++) {
            _edges.add(new Edge(_vertices.get((int)(Math.random()*second)+first),_vertices.get((int)(Math.random()*first))));
        }

        makeGraph();
    }

    private List<BipartiteVertex> populateBipartiteVertices(int first, int second) {
        List<BipartiteVertex> vertices = new ArrayList<>();
        for (int i = 0;i<first+second;i++) {
            boolean exists = false;
            int x = (int)(Math.random()*1400);
            int y = (int)(Math.random()*900);
            for (Vertex vertex : vertices) {
                //Checks if a vertex exists at the randomly generate position
                if (x >= vertex.getX()-Vertex.NODE_SIZE && x <= vertex.getX()+Vertex.NODE_SIZE) {
                    exists = true;
                    i--;
                    break;
                }
            }
            if (!exists) {
                vertices.add(new BipartiteVertex(x,y));
            }
        }
        return vertices;
    }

    private void setFirstAndSecond(int first, int second) {
        for (int i = 0 ;i<first;i++) {
            _list.get(i).setPlayer(BipartiteVertex.Player.ONE);
        }

        for (int i = first; i<first+second;i++) {
            _list.get(i).setPlayer(BipartiteVertex.Player.TWO);
        }
    }
}
