package lesson_2;

public class ExSix {
    public static void exSix(){
        int[] m = new int[100];
        int n = m.length;
        int c = 1;
        for(int ind = 0; ind < n; ind++){
            m[ind] = c++;
            System.out.println(m[ind]);
        }
    }
}