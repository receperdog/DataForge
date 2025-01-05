package graph;

import graphs.weighted.Edge;
import graphs.weighted.WeightedGraph;

import java.util.*;

public class BFS {
    /**
     * Perform a Breadth-First Search (Geniş Öncelikli Arama)
     * starting from a given city (şehir).
     *
     * @param graph The weighted graph (ağırlıklı graf)
     * @param startCity The city (şehir) to start BFS from
     */

    public static void bfs(WeightedGraph graph, String startCity) {
        // We're using Set DS because Set is a collection that contains no duplicate elements.
        Set<String> visited = new HashSet<>(); // Takip edilenler
        Queue<String> queue = new LinkedList<>(); // Kuyruk

        visited.add(startCity);
        queue.offer(startCity);

        while (!queue.isEmpty()) {
            String currentCity = queue.poll();
            System.out.print(currentCity + " ");

            // Explore all edges from currentCity
            for (Edge edge : graph.getEdges(currentCity)) {
                String neighborCity = edge.getDestination();
                if (!visited.contains(neighborCity)) {
                    visited.add(neighborCity);
                    queue.offer(neighborCity);
                }
            }
        }
        System.out.println();

    }
}
