# Weighted Graph Implementation

This project contains a simple implementation of a weighted graph in Java. The graph is represented using an adjacency list, and each edge has a weight associated with it. The project includes the following classes:

- `WeightedGraph`: Represents the graph structure.
- `Edge`: Represents an edge in the graph with a destination and weight.

## Classes

### WeightedGraph

The `WeightedGraph` class represents a graph where each edge has a weight. It uses a map to store the adjacency list, where the keys are city names (nodes) and the values are lists of edges.

#### Methods

- `addNode(String city)`: Adds a node (city) to the graph.
- `addEdge(String source, String destination, int distance)`: Adds a weighted edge between two nodes. If the graph is undirected, it adds edges in both directions.
- `getEdges(String city)`: Returns the list of edges for a given city.
- `getAllNodes()`: Returns a set of all nodes in the graph.
- `printGraph()`: Prints the adjacency list of the graph in a readable format.

### Edge

The `Edge` class represents an edge in the graph. It contains the destination city and the weight (distance) of the edge.

#### Methods

- `Edge(String destination, int weight)`: Constructor to create an edge with a destination and weight.
- `getDestination()`: Returns the destination city of the edge.
- `getWeight()`: Returns the weight (distance) of the edge.
- `toString()`: Returns a string representation of the edge in the format `destination(weight)`.

## Example Usage

The `Main` class demonstrates how to use the `WeightedGraph` and `Edge` classes to create a graph and add edges between cities.

```java
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
```

This will output the adjacency list of the graph, showing the cities and the distances between them.
