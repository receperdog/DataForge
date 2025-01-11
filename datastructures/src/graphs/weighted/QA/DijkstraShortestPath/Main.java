package graphs.weighted.QA.DijkstraShortestPath;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("0");
        graph.addNode("1");
        graph.addNode("2");
        graph.addNode("3");

        graph.addEdge("0", "1", 4);
        graph.addEdge("0", "2", 1);
        graph.addEdge("1", "3", 1);
        graph.addEdge("2", "1", 2);
        graph.addEdge("2", "3", 5);

        graph.printGraph();
    }
}
