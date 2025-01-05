package graph;

import graphs.weighted.WeightedGraph;

public class Main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();

        // Add multiple edges between the same cities to test
        // Example: Antalya -> Elbistan (distance 600), and another edge with distance 650
        graph.addEdge("Antalya", "Elbistan", 600);
        graph.addEdge("Antalya", "Elbistan", 650); // Another route
        graph.addEdge("Antalya", "İstanbul", 720);
        graph.addEdge("Elbistan", "Ankara", 460);
        graph.addEdge("İstanbul", "Ankara", 450);
        graph.addEdge("Antalya", "Ankara", 300);
        // Print out the graph (see the multiple edges)
        System.out.println("=== WeightedGraph Adjacency List ===");
        graph.printGraph();

        // BFS from Antalya
        System.out.println("\n=== BFS starting from Antalya ===");
        BFS.bfs(graph, "Antalya");
    }
}
