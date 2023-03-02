import java.util.Scanner;

public class EyeOfSauron {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        int before = 0;
        int after = 0;
        for (int i = 0; i < input.length; i++) {

            if (input[i] == '|') {
                after++;
            } else if (input[i] == '(') {
                before = after;
                after = 0;
            }
        }
        if (before == after) {
            System.out.println("correct");
        } else System.out.println("fix");
    }


}

