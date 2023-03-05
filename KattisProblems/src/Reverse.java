import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfInputs = sc.nextInt();
        int[] inputs = new int[noOfInputs];

        for (int i = 0; i < noOfInputs; i++) {
            inputs[i] = sc.nextInt();
        }

        for (int i = noOfInputs-1; i >= 0; i--) {
            System.out.println(inputs[i]);
        }
    }
}
