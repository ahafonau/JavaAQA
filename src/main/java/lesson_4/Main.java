package lesson_4;

public class Main {
    public static void main(String[] args) {
        Cat[] catsArray = {new Cat("cat_1"), new Cat("cat_2"), new Cat("cat_3")};
        Dog[] dogsArray = {new Dog("dog_1"), new Dog("dog_2"), new Dog("dog_3")};

        catsArray[0].run(200);
        catsArray[1].run(201);
        catsArray[2].run(199);

        catsArray[0].swim(0);
        catsArray[1].swim(-1);
        catsArray[2].swim(1);

        System.out.println("Cats done");
        System.out.println("_______________");

        dogsArray[0].run(500);
        dogsArray[0].run(501);
        dogsArray[0].run(499);

        dogsArray[0].swim(10);
        dogsArray[0].swim(11);
        dogsArray[0].swim(9);

        System.out.println("Dogs done");
        System.out.println("_______________");


        Plate plate = new Plate(32);
        for (Cat cat : catsArray) {
            cat.eat(plate, 11);
            System.out.println(cat.isFull());
        }
        System.out.println("_______________");

        Good[] goods = {new Good("good_1", 100), new Good("good_2", 100500)};

        Payment payment = new Payment().new Buyer().buy(goods);

        System.out.println(payment);

        System.out.println("_______________");

        Attraction[] attractionsArray = {new Attraction("Attraction_1", 14.00, 18.00, 10),
                new Attraction("Attraction_2", 11.00, 14.00, 5)};

        Park park = new Park(attractionsArray);
        park.new Info().getInfo();

        System.out.println("_______________");
    }
}