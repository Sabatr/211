package softeng211.chapter19;

import softeng211.graphmaker.BipartiteGraph;

public class Main {
    public static void main(String[] args) {
        BipartiteGraph graph = new BipartiteGraph();
        graph.makeRandomBipartiteGraph(4,4,2,2);
    }
}
