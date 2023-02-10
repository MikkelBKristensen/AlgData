import edu.princeton.cs.algs4.QuickFindUF;
import edu.princeton.cs.algs4.StdOut;

public class QuickFindExercise {
    public static void main(String[] args) {

        QuickFindUF QF = new QuickFindUF(10);
        int totalElements = QF.count();

        QF.union(9,0);
        QF.union(3,4);
        QF.union(5,8);
        QF.union(7,2);
        QF.union(2,1);
        QF.union(5,7);
        QF.union(0,3);


        System.out.println("Number of sets: " + QF.count());
        for (int i = 0; i < totalElements; i++) {
            System.out.println(i + " has " + QF.find(i) + " as it's root.");
        }

    }
}
