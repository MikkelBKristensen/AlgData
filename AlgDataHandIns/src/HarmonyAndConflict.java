import edu.princeton.cs.algs4.Bipartite;
import edu.princeton.cs.algs4.Graph;
import java.util.Scanner;

public class HarmonyAndConflict {

    public class Edge {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vertices = sc.nextInt();
        int edges = sc.nextInt();

        Graph graph = new Graph(vertices);

        for (int i = 0; i < edges; i++) {
            graph.addEdge(sc.nextInt(), sc.nextInt());
            sc.skip(" 1");
        }

        Bipartite bipartite = new Bipartite(graph);

        if (bipartite.isBipartite()) {
            System.out.println(1);
        } else System.out.println(0);

    }

}

