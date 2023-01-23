import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 4, 6, 9, 1};
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println("The rotated array is: " + Arrays.toString(arr));
    }
}
