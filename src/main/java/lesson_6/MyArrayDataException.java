package lesson_6;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String s){
        super("Invalid data " + s);
    }

}
