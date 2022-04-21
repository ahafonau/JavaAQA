package lesson_4;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void run(int distance) {
        if ( distance >0 && distance <= 500){
            System.out.println("The dog is running " + distance);
        }
        else {
            System.out.println("The dog is smoking");
        }
    }

    @Override
    void swim(int distance) {
        if ( distance >0 && distance <= 10){
            System.out.println("The dog is swimming " + distance);
        }
        else {
            System.out.println("The dog is smoking");
        }
    }
}