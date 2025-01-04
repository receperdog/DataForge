package graphs.weighted;

public class Main {
    public static void main(String[] args) {
        // Create a weighted graph (Ağırlıklı Graf)
        WeightedGraph weightedGraph = new WeightedGraph();

        // Add edges (kenarlar) representing the distance between cities
        weightedGraph.addEdge("Antalya", "Elbistan", 600);
        weightedGraph.addEdge("Antalya", "İstanbul", 720);
        weightedGraph.addEdge("Elbistan", "Ankara", 460);
        weightedGraph.addEdge("İstanbul", "Ankara", 450);
        // You can add more edges as needed

        // Print out the graph
        System.out.println("** Weighted Graph (Ağırlıklı Graf) **");
        weightedGraph.printGraph();
    }
}
