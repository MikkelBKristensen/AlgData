import java.util.*;

public class HarmonyAndConflict3 {



    static class Graph {
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

        public class GraphColoringRules {
            public void main(String[] args) {
                int V = 5; // number of vertices
                int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 4}, {0, 4}}; // edge list
                int[] colors = {1, 1, 2, 2, 1}; // color of each vertex
                Graph graph = new Graph(V);
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

    }



}
