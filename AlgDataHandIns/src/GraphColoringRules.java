import java.util.ArrayList;
import java.util.List;

public class GraphColoringRules {

    public class Graph {
        private final int V;
        private final List<Integer>[] adjList;

        public Graph(int V) {
            this.V = V;
            adjList = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                adjList[i] = new ArrayList<>();
            }
        }

        public void addEdge(int u, int v) {
            adjList[u].add(v);
            adjList[v].add(u);
        }

        public boolean isViolatingRules(int[] colors) {
            for (int u = 0; u < V; u++) {
                for (int v : adjList[u]) {
                    if (u < v) { // to avoid considering each edge twice
                        if (colors[u] != colors[v]) {
                            // conflict edge with endpoints of different colors
                            return true;
                        } else if (u != v && colors[u] == colors[v]) {
                            // harmony edge with endpoints of the same color (excluding loops)
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }


    public static void main(String[] args) {
        int V = 13; // number of vertices
        int[][] edges = {{0, 1}, {0, 2}, {0, 5}, {0, 6}, {1, 3}, {3, 5},{5, 4},{4, 6}, {6, 7}, {7, 8}, {8, 10}, {10, 12}, {10, 9}, {11, 12}, {9, 11},}; // edge list
        int[] colors = {1, 2, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2}; // color of each vertex
        HarmonyAndConflict3.Graph graph = new HarmonyAndConflict3.Graph(V);
        for (int[] edge : edges) {
            graph.addEdge(edge[0], edge[1]);
        }
        if (graph.isViolatingRules(colors)) {
            System.out.println("The graph is violating the rules.");
        } else {
            System.out.println("The graph is not violating the rules.");
        }
    }
}

