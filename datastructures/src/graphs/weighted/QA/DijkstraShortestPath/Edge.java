package graphs.weighted.QA.DijkstraShortestPath;

public class Edge {
    private final double weight;
    private final String destination;

    public Edge(String destination, double weight) {
        this.destination = destination;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getDestination() {
        return destination;
    }
}
