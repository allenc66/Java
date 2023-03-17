public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(0,5,6));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0 && 5* bigCount + smallCount >= goal) {
            for (int i = 0; i <= smallCount; i++) {
                if ((goal - i) % 5 == 0 && (goal - i) % 5 <= bigCount) {
                    return true;
                }
            }
        }
        return false;
    }
}
