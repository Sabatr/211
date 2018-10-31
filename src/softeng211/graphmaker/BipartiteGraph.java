package softeng211.graphmaker;

import java.util.ArrayList;

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
    public BipartiteGraph() {
        _edges = new ArrayList<>();
    }
    public void makeRandomBipartiteGraph(int first,int second,int edgesOfFirst, int edgesOfSecond) {
        _vertices = populateVertices(first+second);
        //We want to make sure only the even numbers point to odd and odd points to even.
        for (int i = 0; i<edgesOfFirst;i++) {
            int getEven = (int)(Math.random() * first/2)*2;
            int getOdd = (int)(Math.random() * second/2)*2+1;
            _edges.add(new Edge(_vertices.get(getEven),_vertices.get(getOdd)));
        }

        for (int i =0;i<=edgesOfSecond;i++) {
            int getEven = (int)(Math.random() * first/2)*2;
            int getOdd = (int)(Math.random() * second/2)*2+1;
            _edges.add(new Edge(_vertices.get(getOdd),_vertices.get(getEven)));
        }

        makeGraph();
    }
}
