public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
        int day = (int) (minutes / 60 / 24);
        int year = day / 365;
        int remainingDays = day % 365;
        System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }
}
