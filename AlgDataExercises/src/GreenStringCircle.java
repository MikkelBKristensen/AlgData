import edu.princeton.cs.algs4.Queue;
import java.util.Scanner;

public class GreenStringCircle {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Character> queue = new Queue<>();

        String input = sc.next();
        String inputCheck = sc.next();

        if (input.equals(inputCheck)) System.out.println("They are the same");

        char[] inputArray = input.toCharArray();

        for (char c : inputArray) {
            queue.enqueue(c);
        }

        for (int i = 0; i < inputArray.length; i++) {
            char temp = queue.dequeue();
            queue.enqueue(temp);

            if (queue.equals(inputArray)) {
                System.out.println(input + " is a circular rotation of " + inputCheck);
            }
        }


    }
}
