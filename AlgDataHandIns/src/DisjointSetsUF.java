import edu.princeton.cs.algs4.UF;

import java.util.Scanner;

public class DisjointSetsUF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfSets = sc.nextInt();
        int noOfOperations = sc.nextInt();
        UF QF = new UF(noOfSets);

        for (int i = 0; i < noOfOperations; i++) {
            int query = sc.nextInt();
            int s = sc.nextInt();
            int t = sc.nextInt();
            if (query == 0) {
                if (QF.connected(s, t)) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (query == 1) {
                QF.union(s, t);
            } /*else if (query == 2) {
                if (!QF.connected(s, t)) {
                    QF.id[s]
                }
            }*/

        }

    }
}
