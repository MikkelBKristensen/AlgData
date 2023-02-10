import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("")) {
            System.out.println("1");
        } else if ((input.length() % 2) != 0) {
            System.out.println("0");
        }
        char[] charArr = input.toCharArray();
        for (char c : charArr) {
            System.out.println(c);
        }




    }
}
