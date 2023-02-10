import java.util.NoSuchElementException;
import java.util.Scanner;
import edu.princeton.cs.algs4.Stack;

public class Balance {

    static boolean isBalanced(String[] input) throws NoSuchElementException {
        Stack<String> par = new Stack<>();
        if ((input.length % 2) != 0) {
            return false;
        }
        try {
            for (int i = 0; i < input.length; i++) {
                switch (input[i]) {
                    case "(" : par.push("(");
                        break;
                    case "[" : par.push("[");
                        break;
                    case ")" : String value1 = par.pop();
                        if (value1 == null || value1 == "[") {
                        return false;
                    };
                        break;
                    case "]" : String value2 = par.pop();
                        if (value2 == null || value2 == "(") {
                            return false;
                    };
                        break;
                    default:
                        return false;
                }
            }
            if (!par.isEmpty()) {
                return false;
            }
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");
        if (isBalanced(input)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
