package lesson_13_tests;

import lesson_13.TriangleCreationDataException;
import lesson_13.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    private static final Logger LOGGER = LogManager.getLogger();

    @Test
    public void shouldCompareTwoSameTriangles() throws TriangleCreationDataException {
        Triangle triangle1 = new Triangle(5,6,7);
        Triangle triangle2 = new Triangle(5,6,7);

        double area1 = Triangle.calculateArea(triangle1);
        double area2 = Triangle.calculateArea(triangle2);

        try {
            assertEquals(area1, area2);
        }
        catch (AssertionFailedError e){
            LOGGER.info("Failed");
            throw e;
        }

        LOGGER.info("Passed");
    }

    @Test
    public void shouldCompareTwoDifferentTriangles() throws TriangleCreationDataException {
        Triangle triangle1 = new Triangle(5,6,7);
        Triangle triangle2 = new Triangle(5,6,8);

        double area1 = Triangle.calculateArea(triangle1);
        double area2 = Triangle.calculateArea(triangle2);

        try {
            assertNotEquals(area1, area2);
        }
        catch (AssertionFailedError e){
            LOGGER.info("Failed");
            throw e;
        }

        LOGGER.info("Passed");
    }

    @Test
    public void shouldThrowExceptionWhenSideIsInvalid() {

        try {
            assertThrows(TriangleCreationDataException.class, () -> new Triangle(0,6,8));
            assertThrows(TriangleCreationDataException.class, () -> new Triangle(6,0,8));
            assertThrows(TriangleCreationDataException.class, () -> new Triangle(5,6,0));

            assertThrows(TriangleCreationDataException.class, () -> new Triangle(14,6,8));
            assertThrows(TriangleCreationDataException.class, () -> new Triangle(6,14,8));
            assertThrows(TriangleCreationDataException.class, () -> new Triangle(8,6,14));
        }
        catch (AssertionFailedError e){
            LOGGER.info("Failed");
            throw e;
        }
        LOGGER.info("Passed");
    }

    @AfterEach
    public void afterTestStuff() {
        System.out.println("_______________");
        System.out.println(" ");
    }
}