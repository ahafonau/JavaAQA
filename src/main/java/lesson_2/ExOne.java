package lesson_2;

public class ExOne {
    public static boolean exOne(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c = a + b;
        System.out.printf("%s + %s = %s \n", a, b, c);

        if (c >= 10 && c <= 20){
            return true;
        }

        else {
            return false;
        }
    }
}
