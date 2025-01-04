package graphs.weighted;

import java.util.*;

public class WeightedGraph {
    private final Map<String, List<Edge>> adjacencyList;

    public WeightedGraph() {
        this.adjacencyList = new HashMap<>();
    }

    // Add a node (düğüm ekleme) - city
    public void addNode(String city) {
        adjacencyList.putIfAbsent(city, new ArrayList<>());
    }

    // Add a weighted edge (ağırlıklı kenar ekleme)
    public void addEdge(String source, String destination, int distance) {
        // Ensure both source and destination exist in the graph
        addNode(source);
        addNode(destination);

        // Because it's Weighted and (optionally) Undirected
        // If you want it to be Undirected, add edges both ways:
        adjacencyList.get(source).add(new Edge(destination, distance));
        adjacencyList.get(destination).add(new Edge(source, distance));
    }

    public List<Edge> getEdges(String city) {
        return adjacencyList.getOrDefault(city, new ArrayList<>());
    }

    public Set<String> getAllNodes() {
        return adjacencyList.keySet();
    }

    public void printGraph() {
        // Print adjacency list in a nice format
        for (String city : adjacencyList.keySet()) {
            System.out.print("City (Şehir) " + city + " => ");
            System.out.println(adjacencyList.get(city));
        }
    }


}
