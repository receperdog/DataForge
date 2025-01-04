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
        Node (Düğüm) 0:  => [1, 2]
        Node (Düğüm) 1:  => [0, 3]
        Node (Düğüm) 2:  => [0, 4]
        Node (Düğüm) 3:  => [1]
        Node (Düğüm) 4:  => [2]
        */


    }
}
