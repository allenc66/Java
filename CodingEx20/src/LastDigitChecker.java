public class LastDigitChecker {
    public static boolean hasSameLastDigit (int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            int aDigit = a % 10;
            int bDigit = b % 10;
            int cDigit = c % 10;
            if ((aDigit == bDigit) || (bDigit == cDigit) || (aDigit == cDigit)) {
                return true;
            }
        }
        return false;

    }

    public static boolean isValid (int num) {
        return (num >= 10 && num <= 1000);
    }
}
