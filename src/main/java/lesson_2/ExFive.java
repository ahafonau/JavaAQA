package lesson_2;

public class ExFive {
    public static void exFive(){
        int[] arr = {1, 0, 0, 0, 0, 1, 1, 1, 1, 0};
        int numb = arr.length;

        for(int ind = 0; ind < numb; ind++)
            if (arr[ind] == 1) {
                arr[ind] = 0;
            }
            else {
                arr[ind] = 1;
            }

        for (int i : arr) System.out.println(i);
    }
}
