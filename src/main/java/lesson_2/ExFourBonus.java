package lesson_2;

public class ExFourBonus {
    public static boolean exFourBonus(int n) {
        return n % 4 == 0 && (n % 400 == 0 || n % 100 != 0) && n != 0;
    }
}
