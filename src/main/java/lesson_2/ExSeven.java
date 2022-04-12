package lesson_2;

public class ExSeven {
    public static void exSeven(){
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int n = mas.length;
        for(int ind = 0; ind < n; ind++){
            if (mas[ind] < 6) {
                mas[ind] = mas[ind]*2;
            }
            System.out.println(mas[ind]);
        }
    }
}