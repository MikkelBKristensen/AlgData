import java.util.*;

public class HarmonyAndConflict2 {

    public static boolean isBipartite(int V, int E, int[][] edges) {
        // Initialize an array to keep track of the color of each vertex
        int[] colors = new int[V];

        // Initialize all vertices to have no color (-1)
        Arrays.fill(colors, -1);

        // Create an adjacency list representation of the graph
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Perform BFS on each component of the graph
        for (int i = 0; i < V; i++) {
            if (colors[i] == -1) {
                if (!isBipartiteHelper(adjList, colors, i)) {
                    // The graph is not bipartite
                    return false;
                }
            }
        }

        // The graph is bipartite
        return true;
    }

    private static boolean isBipartiteHelper(List<List<Integer>> adjList, int[] colors, int start) {
        // Initialize a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Color the starting vertex with 0
        colors[start] = 0;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v : adjList.get(u)) {
                if (colors[v] == -1) {
                    // Color the neighbor with a different color than u
                    colors[v] = 1 - colors[u];
                    queue.offer(v);
                } else if (colors[v] == colors[u]) {
                    // The graph is not bipartite
                    return false;
                }
            }
        }

        // All vertices reachable from the start vertex have been colored
        // and no conflicts were found, so the graph is bipartite
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int noOfEdges = sc.nextInt();
        int[][] edges = new int[noOfEdges][2];

        for (int i = 0; i < noOfEdges; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            sc.skip(" 1");
        }

        System.out.println(isBipartite(vertices, noOfEdges, edges));
    }

}
