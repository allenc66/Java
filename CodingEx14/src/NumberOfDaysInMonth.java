public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(13, 2020));
        System.out.println(getDaysInMonth(1, 202000));
        System.out.println(getDaysInMonth(13213, -2020));
    }

//    public static boolean isLeapYear(int year){
//        if (year >= 1 && year <= 9999) {
//            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
//                return true;
//            }
//            return false;
//        }
//        return false;
//    }

    public static boolean isLeapYear(int year){
        if (year <= 1 || year >= 9999) {
            return false;
        } else{
            return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        }
    }
    public static int getDaysInMonth (int month, int year) {
        if ((year < 1 || year > 9999) || (month < 1 || month > 12)){
            return -1;
        } else{
            switch (month) {
//                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                    return 31;
                case 2:
                    return (isLeapYear(year) ? 29 : 28);
                case 4: case 6: case 9: case 11:
                   return 30;
                default: return 31;
            }
        }
    }
}
