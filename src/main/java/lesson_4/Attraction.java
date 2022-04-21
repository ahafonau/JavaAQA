package lesson_4;

public class Attraction {
    String name;
    double startTime;
    double endTime;
    int price;

    public Attraction(String name, double startTime, double endTime, int price) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Attraction: " +
                "name= " + name + '\'' +
                ", startTime= " + startTime +
                ", endTime= " + endTime +
                ", price= " + price;
    }
}
