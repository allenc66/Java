import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int count = scanner.nextInt();
        return count;
    }

    private static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[count];
        System.out.println("Enter " + count + " numbers" );
        for (int i = 0; i < intArray.length; i++ ){
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    private static int findMin(int[] array) {
        int minimum = array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]){
                    minimum = Math.min(array[i], minimum);
                }
            }
        }
        return minimum;
    }
}
