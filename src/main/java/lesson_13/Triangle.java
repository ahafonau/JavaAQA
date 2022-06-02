package lesson_13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Triangle {
    private int a;
    private int b;
    private int c;
    private static final Logger LOGGER = LogManager.getLogger();

    public Triangle(int a, int b, int c) throws TriangleCreationDataException {

        if (a >= b + c || a <= 0) {
            throw new TriangleCreationDataException();
        }

        if (b >= a + c || b <= 0) {
            throw new TriangleCreationDataException();
        }

        if (c >= a + b || c <= 0) {
            throw new TriangleCreationDataException();
        }

        this.a = a; // Triangle bottom
        this.b = b; // Triangle left side
        this.c = c; // Triangle right side
    }

    public static double calculateArea(Triangle triangle) {
        int p = (triangle.getA() + triangle.getB() + triangle.getC()) / 2;
        LOGGER.info("Calculating area with sides " + triangle.getA() + " " + triangle.getB() + " " + triangle.getC());
        return Math.sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC()));
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
