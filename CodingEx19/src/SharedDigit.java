public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }
    public static boolean hasSharedDigit (int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            int num1Digit;
            int num2Digit;
            int originalNum2 = num2;
            while (num1 != 0) {
                num1Digit = num1 % 10;
                num2 = originalNum2;
                while (num2 != 0) {
                    num2Digit = num2 % 10;
                    if (num1Digit == num2Digit){
                        return true;
                    }
                    num2 /= 10;
                }
                num1 /= 10;
            }
        }
        return false;
    }
}
