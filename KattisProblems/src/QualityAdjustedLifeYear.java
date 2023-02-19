import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPeriods = sc.nextInt();
        double qaly = 0;
        for (int i = 0; i < numberOfPeriods; i++) {
            double score = sc.nextDouble();
            double time = sc.nextDouble();
            qaly += score * time;
        }
        System.out.println(qaly);

    }
}