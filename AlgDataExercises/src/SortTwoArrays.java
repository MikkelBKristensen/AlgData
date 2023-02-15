import java.util.Arrays;

public class SortTwoArrays {


    public static void main(String[] args) {

        // Binary search * for loop
        // (1+log_2(n)) * n = C * n

        int[] array1 = {85, 1, 123, 2, 231, 99, 64, 453, 54, 14, 244};
        int[] array2 = {241, 1, 64, 75, 244, 453, 213, 744, 123, 147, 5};

        int n = array1.length;

        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < n; i++) {
            if (Arrays.binarySearch(array2, array1[i]) >= 0) {
                System.out.println(array1[i]);
            }
        }
    }
}
