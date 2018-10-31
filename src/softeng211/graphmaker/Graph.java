package softeng211.graphmaker;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for making the graph which is displayable to the user. It stores all of the vertices
 * and edges too.
 *
 * @author Brian Nguyen
 */
public class Graph{
    public static int FRAME_WIDTH = 1500;
    protected List<Vertex> _vertices;
    protected List<Edge> _edges;
    private JFrame _frame;

    /**
     * The user can either make their own graph or generate a new one.
     * @param vertices
     * @param edges
     */
    public Graph(List<Vertex> vertices,List<Edge> edges) {
        _vertices = vertices;
        _edges = edges;
        makeGraph();
    }
    public Graph() {
    }

    /**
     * Makes the frame which is used for the graph.
     */
    protected void makeGraph() {
        _frame = new JFrame();
        _frame.setSize(FRAME_WIDTH,1000);
        _frame.setLocationRelativeTo(null);
        _frame.add(new NodePanel(_vertices,_edges));
        _frame.setTitle("Graph");
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setVisible(true);
    }

    /**
     * Makes a random graph based on the user preference.
     * @param numberOfVertices
     * @param numberOfEdges
     */
    public void makeRandomGraph(int numberOfVertices,int numberOfEdges) {
        if (_vertices != null || _edges != null) {
            System.out.println("Cannot set vertices and edges if you want a random list.");
            return;
        }
        if ((numberOfVertices*(numberOfVertices-1))/2 < numberOfEdges) {
            System.out.println("Cannot create a graph with " + numberOfVertices +" vertices and " + numberOfEdges +" edges.");
            System.out.println("NOTE: This program does not handle edges pointing to itself.");
            return;
        }
        _vertices = populateVertices(numberOfVertices);
        _edges = populateEdges(numberOfEdges);
        makeGraph();

    }

    /**
     * Randomly n number of vertices. These vertices cannot overlap.
     * @param numberOfVertices: the number of vertices the user wants
     * @return
     */
    protected List<Vertex> populateVertices(int numberOfVertices) {
        List<Vertex> vertices = new ArrayList<>();
        for (int i = 0;i<numberOfVertices;i++) {
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
                vertices.add(new Vertex(x,y));
            }
        }
        return vertices;
    }

    /**
     * Randomly creates edges between existing vertices.
     * @param numberOfEdges
     * @return
     */
    private List<Edge> populateEdges(int numberOfEdges) {
        List<Edge> edges = new ArrayList<>();
        for (int i = 0;i<numberOfEdges;i++) {
            boolean exists = false;
            Vertex vertexOne = _vertices.get((int)(Math.random()*_vertices.size()));
            Vertex vertexTwo = _vertices.get((int)(Math.random()*_vertices.size()));
            if (vertexOne.equals(vertexTwo)) {
                i--;
                exists = true;
            }
            for (Edge edge : edges) {
                //Checks if edge exists or if the chosen vertex is itself
                if ((edge.getStartingVertex().equals(vertexOne) && edge.getEndingVertex().equals(vertexTwo)) ||
                        (edge.getStartingVertex().equals(vertexTwo)&& edge.getEndingVertex().equals(vertexOne))){
                    exists = true;
                    i--;
                    break;
                }
            }
            if (!exists) {
                edges.add(new Edge(vertexOne,vertexTwo));
            }
        }
        return edges;
    }

    /**
     *
     * @return the original vertices
     */
    public List<Vertex> getVertices() {
        return _vertices;
    }

    /**
     *
     * @return the original edges
     */
    public List<Edge> getEdges() {
        return _edges;
    }

    /**
     * Updates the graph when necessary.
     * @param newVertices
     */
    public void update(List<Vertex> newVertices) {
        _frame.getContentPane().removeAll();
        _frame.add(new NodePanel(newVertices,_edges));
        _frame.repaint();
        _frame.revalidate();
    }

    public void update(List<Vertex> newVertices, List<Edge> newEdges) {
        _frame.getContentPane().removeAll();
        _frame.add(new NodePanel(newVertices,newEdges));
        _frame.repaint();
        _frame.revalidate();
    }

}
