package softeng211.chapter5.graphs;

import softeng211.graphmaker.Edge;
import softeng211.graphmaker.Graph;
import softeng211.graphmaker.Vertex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Vertex> vertexList = new ArrayList<>();
//        List<Edge> edgeList = new ArrayList<>();
//        Vertex vertexOne = new Vertex(100,100);
//        Vertex vertexTwo = new Vertex(150,150);
//        Edge edge = new Edge(vertexOne,vertexTwo);
//        Vertex vertexThree = new Vertex(300,200);
//        Edge edge2 = new Edge(vertexTwo,vertexThree);
//
//        edgeList.add(edge);
//        edgeList.add(edge2);
//
//        vertexList.add(vertexOne);
//        vertexList.add(vertexTwo);
//        vertexList.add(vertexThree);

//        new Graph(vertexList,edgeList);
        new Graph().makeRandomGraph(5,4);
    }
}
