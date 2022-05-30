package lesson_2;

public class ExEight {
    public static void exEight() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i][i]);
        }
    }
}
