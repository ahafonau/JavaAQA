package lesson_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(ExOne.exOne(6, 8));
        System.out.println("__________________________");
        ExTwo.exTwo(-6);
        System.out.println("__________________________");
        System.out.println(ExThree.exThree(-8));
        System.out.println("__________________________");
        ExFour.exFour("привет", 6);
        System.out.println("__________________________");
        System.out.println("Visokosni ? " + ExFourBonus.exFourBonus(1600));
        System.out.println("__________________________");
        ExFive.exFive();
        System.out.println("__________________________");
        ExSix.exSix();
        System.out.println("__________________________");
        ExSeven.exSeven();
        System.out.println("__________________________");
        ExEight.exEight();
        System.out.println("__________________________");
    }
}