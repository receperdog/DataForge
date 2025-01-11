package graphs.weighted.QA.DijkstraShortestPath;

import java.util.*;

public class Graph {
    private final Map<String, List<Edge>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to, double weight) {
        // bidirectional graph
        addNode(from);
        addNode(to);

        List<Edge> edgesFrom = adjacencyList.get(from);
        edgesFrom.add(new Edge(to, weight));

        List<Edge> edgesTo = adjacencyList.get(to);
        edgesTo.add(new Edge(from, weight));

    }

    public List<Edge> getEdges(String from) {
        if (!adjacencyList.containsKey(from)) {
            return new ArrayList<>();
        }
        return adjacencyList.get(from);
    }

    public Set<String> getNodes() {
        return adjacencyList.keySet();
    }

    public void printGraph() {
        for (String node : adjacencyList.keySet()) {
            System.out.print(node + " -> ");
            for (Edge edge : adjacencyList.get(node)) {
                System.out.print(edge.getDestination() + "(" + edge.getWeight() + ") ");
            }
            System.out.println();
        }
    }


}
