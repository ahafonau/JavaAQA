import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void  printThreeWords(){
        System.out.println("Упражнение 2:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("Упражнение выполнено!");
        System.out.println("___________________");
    }

    public static void checkSumSign(){
        int a = new Random().nextInt();
        int b = new Random().nextInt();
        int c = a+b;

        System.out.println("Упражнение 3:");
        System.out.println("Значение a = " + a);
        System.out.println("Значение b = " + b);
        System.out.println("Значение c = " + c);


        if (c >= 0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println("Упражнение выполнено!");
        System.out.println("___________________");
    }

    public static void printColor(){
        int value = new Random().nextInt(200) - new Random().nextInt(150);

        System.out.println("Упражнение 4:");

        if (value <= 0){
            System.out.println("Красный");
        }

        else if(value > 0 && value <= 100){
            System.out.println("Желтый");
        }

        else if(value > 100){
            System.out.println("Зеленый");
        }
        System.out.println("Упражнение выполнено!");
        System.out.println("___________________");

    }
    public static void compareNumbers(){
        int a = new Random().nextInt();
        int b = -10000;
        System.out.println("Упражнение 5:");

        if(a>=b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
        System.out.println("Упражнение выполнено!");
        System.out.println("___________________");
    }
}
