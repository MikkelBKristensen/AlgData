import edu.princeton.cs.algs4.Stopwatch;

public class OrderOfGrowthTest {

    public static void main(String[] args) {

        Stopwatch stopwatch = new Stopwatch();
        long N = 16000L;
        long sum = 0;
        for (long n = N; n > 0 ; n /= 2) {
            for (int i = 0; i < n; i++) {
                sum++;
            }
        }
        System.out.println(stopwatch.elapsedTime());


    }
}
