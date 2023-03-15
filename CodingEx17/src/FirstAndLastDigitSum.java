public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        do {
            firstDigit = number % 10;
            number /= 10;
        } while (number != 0);
        return (lastDigit + firstDigit);
    }
}
