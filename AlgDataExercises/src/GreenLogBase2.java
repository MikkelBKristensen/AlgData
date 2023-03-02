import edu.princeton.cs.algs4.Stack;

import java.util.Iterator;

public class GreenLogBase2 {
    static int logBase2(int n) {
        if (n == 0) {
            System.out.println("Logarithm is only defined for natural numbers. Please try again.");
            throw new IllegalArgumentException("Twat");
        }
        int value = 1;
        int counter = 0;
        while (value <= n) {
            value *= 2;
            counter++;
        }
        return counter - 1;
    }
    public static void main(String[] args) {
        System.out.println(logBase2(3));
    }
}
