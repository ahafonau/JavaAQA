package lesson_4;

public class Good {
    private String name;
    private int price;

    public Good(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Good " +
                "name=" + name + '\'' +
                ", price= " + price + '\'';
    }
}
