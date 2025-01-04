package graphs.undirected;


import java.util.ArrayList;
import java.util.List;

public class UndirectedGraph {
    private final int numberOfNodes; // number of Nodes (Düğümler)
    private final List<List<Integer>> adjacencyList; // Adjacency List (Komşuluk Listesi)

    public UndirectedGraph(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        adjacencyList = new ArrayList<>(numberOfNodes); // initial capacity

        // For each node, initialize an inner list
        for(int i = 0 ; i < numberOfNodes ; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        // Undirected: add to both lists
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void printGraph() {
        for(int i = 0 ; i < numberOfNodes; i++) {
            System.out.print("Node (Düğüm) " + i + ": " + " => ");
            System.out.println(adjacencyList.get(i));
        }
    }
}
