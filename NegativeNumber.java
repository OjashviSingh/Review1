import java.util.Arrays;

public class NegativeNumber {
    public static void main(String[] args) {
        int[] arr = {1, -13, -18, 4, 65, 43, -5, 23, -4, -56};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("The modified array is: " + Arrays.toString(arr));
    }
}
