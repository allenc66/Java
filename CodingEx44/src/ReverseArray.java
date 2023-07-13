import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] arr) {
        int[] reversedArr = new int[arr.length];
        int i = 0;
        for (int j = arr.length-1; j >= 0; j--) {
            reversedArr[j] = arr[i];
            i++;
        }

        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("Reversed array = " + Arrays.toString(reversedArr));
    }
}
