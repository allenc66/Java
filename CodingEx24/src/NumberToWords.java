public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
        System.out.println(reverse(-23));
        System.out.println(getDigitCount(7));
    }
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.print("Invalid Value");
        } else {
            int reversedNum = reverse(number);
                for (int count = getDigitCount(number); count > 0; count--) {
                    int digit = reversedNum % 10;
                    switch (digit) {
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                        default:
                            System.out.println("Zero");
                            break;
                }

                reversedNum /= 10;
            }
        }
    }

    public static int reverse (int number) {
        int reverseNum = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverseNum = reverseNum * 10 + remainder;
            number /= 10;

        }
        return reverseNum;
    }

    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        } else {
            int count = 1;

            while (number > 9) {
                number /= 10;
                count ++;
            }
            return count;
        }
    }
}
