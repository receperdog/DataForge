package graphs.undirected;

public class Main {
    public static void main(String[] args) {
        UndirectedGraph undirectedGraph = new UndirectedGraph(5);
        // Add some edges
        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(0, 2);
        undirectedGraph.addEdge(1, 3);
        undirectedGraph.addEdge(2, 4);

        // print out the Adjacency list
        undirectedGraph.printGraph();

        /*
        OUTPUT:
        Graph (Düğüm) 0:  => [1, 2]
        Graph (Düğüm) 1:  => [0, 3]
        Graph (Düğüm) 2:  => [0, 4]
        Graph (Düğüm) 3:  => [1]
        Graph (Düğüm) 4:  => [2]
        */


    }
}
