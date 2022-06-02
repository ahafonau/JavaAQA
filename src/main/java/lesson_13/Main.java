package lesson_13;

public class Main {
    public static void main(String[] args) throws TriangleCreationDataException {
        Triangle triangle = new Triangle(5, 6, 7);
        System.out.println("Triangle Area (s) = " + Triangle.calculateArea(triangle));
    }
}
