import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = Integer.parseInt(sc.nextLine());

            List<String> A = new ArrayList<>();
            List<String> B = new ArrayList<>();
            List<String> C = new ArrayList<>();
            List<String> D = new ArrayList<>();
            List<String> E = new ArrayList<>();
            List<String> FX = new ArrayList<>();
            List<String> F = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                String[] student = sc.nextLine().split(" ");

                switch (student[1]) {
                    case "A" : A.add(student[0]);
                        break;
                    case "B" : B.add(student[0]);
                        break;
                    case "C" : C.add(student[0]);
                        break;
                    case "D" : D.add(student[0]);
                        break;
                    case "E" : E.add(student[0]);
                        break;
                    case "FX" : FX.add(student[0]);
                        break;
                    case "F" : F.add(student[0]);
                        break;
                }
                student = null;
            }
        Collections.sort(A);
        for (String s : A) {
            System.out.println(s);
        }
        Collections.sort(B);
        for (String s : B) {
            System.out.println(s);
        }
        Collections.sort(C);
        for (String s : C) {
            System.out.println(s);
        }
        Collections.sort(D);
        for (String s : D) {
            System.out.println(s);
        }
        Collections.sort(E);
        for (String s : E) {
            System.out.println(s);
        }
        Collections.sort(FX);
        for (String s : FX) {
            System.out.println(s);
        }
        Collections.sort(F);
        for (String s : F) {
            System.out.println(s);
        }

    }

}



