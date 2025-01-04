package graphs.weighted;

// Edge (Kenar) with weight (ağırlık)
public class Edge {
    private final String destination; // The destination city (varış şehri)
    private final int weight; // The distance (mesafe)
    public Edge(String destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    public String getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return destination + "(" + weight + ")";
    }
}
