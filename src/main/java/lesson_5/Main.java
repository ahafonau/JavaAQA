package lesson_5;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Apple weight: " + appleBox.getWeight());
        System.out.println("Orange weight: " + orangeBox.getWeight());
        System.out.println("___________________________");

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox.compare(orangeBox2));
        System.out.println("___________________________");
        System.out.println("Orange box 1 weight: " + orangeBox.getWeight());
        System.out.println("Orange box 2 weight: " + orangeBox2.getWeight());

        orangeBox.moveTo(orangeBox2);
        System.out.println(" ");
        System.out.println("Oranges were moved");

        System.out.println("Orange box 1 weight: " + orangeBox.getWeight());
        System.out.println("Orange box 2 weight: " + orangeBox2.getWeight());
    }
}
