package softeng211.graphmaker;

import javax.swing.*;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

public class Graph{
    private List<Vertex> _vertices;
    private List<Edge> _edges;
    private JFrame _frame;
    public Graph(List<Vertex> vertices,List<Edge> edges) {
        _vertices = vertices;
        _edges = edges;
        makeGraph();
    }
    public Graph() {

    }

    private void makeGraph() {
        _frame = new JFrame();
        _frame.setSize(500,500);
        _frame.setLocationRelativeTo(null);
        _frame.add(new NodePanel(_vertices,_edges));
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setVisible(true);
    }

    public void makeRandomGraph(int numberOfVertices,int numberOfEdges) {
        if (_vertices != null || _edges != null) {
            System.out.println("Cannot set vertices and edges if you want a random list.");
            return;
        }
        if (numberOfVertices <= numberOfEdges) {
            System.out.println("This program cannot handle inputs where number of vertices is greater than number of edges");
            return;
        }
        _vertices = populateVertices(numberOfVertices);
        _edges = populateEdges(numberOfEdges);
        makeGraph();

    }

    private List<Vertex> populateVertices(int numberOfVertices) {
        List<Vertex> vertices = new ArrayList<>();
        for (int i = 0;i<numberOfVertices;i++) {
            boolean exists = false;
            int x = (int)(Math.random()*400);
            int y = (int)(Math.random()*400);
            for (Vertex vertex : vertices) {
                if (x >= vertex.getX()-50 && x <= vertex.getX()+50) {
                    exists = true;
                    i--;
                    break;
                }
            }
            if (!exists) {
                vertices.add(new Vertex(x,y));
            }
        }
        return vertices;
    }

    private List<Edge> populateEdges(int numberOfEdges) {
        List<Edge> edges = new ArrayList<>();
        for (int i = 0;i<numberOfEdges;i++) {
            boolean exists = false;
            Vertex vertexOne = _vertices.get((int)(Math.random()*_vertices.size()));
            Vertex vertexTwo = _vertices.get((int)(Math.random()*_vertices.size()));
            System.out.println(vertexOne.equals(vertexTwo));
            for (Edge edge : edges) {
                if ((edge.getStartingVertex().equals(vertexOne) && edge.getEndingVertex().equals(vertexTwo)) ||
                        (edge.getStartingVertex().equals(vertexTwo)&& edge.getEndingVertex().equals(vertexOne)) ||
                        (vertexOne.equals(vertexTwo))) {
                    exists = true;
                    i--;
                    break;
                }
            }
            if (!exists) {
                edges.add(new Edge(vertexOne,vertexTwo));
            }
        }

        for (Edge edge : edges) {
            System.out.println(edge.getStartingVertex() + " and" + edge.getEndingVertex());
        }
        return edges;
    }

}
