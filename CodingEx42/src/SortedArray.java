import java.util.Arrays;
import java.util.Scanner;


public class SortedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.stream(getIntegers(5)).toArray());
    }
    public static int[] getIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " integers: ");

        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
