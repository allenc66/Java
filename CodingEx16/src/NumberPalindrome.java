public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int lastDigit;
        int origianlNum = number;

        while (number != 0 ) {
            lastDigit = number % 10;
            number /= 10;
            reverse *= 10;
            reverse += lastDigit;
        }

        return (reverse == origianlNum);

    }
}
