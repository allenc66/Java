import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                String numb = scanner.nextLine();
                double number = Double.parseDouble(numb);
                sum += number;
                count++;
            } else {
                break;
            }

        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double
                )sum/count));
    }
}
