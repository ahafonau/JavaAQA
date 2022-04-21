package lesson_4;

public class Cat extends Animal{

    private boolean full;

    public Cat(String name) {
        super(name);
    }

    @Override
    void run(int distance) {
        if ( distance >0 && distance <= 200){
            System.out.println("The cat is running " + distance);
        }
        else {
            System.out.println("The cat is smoking");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("I can't swim");
    }

    public boolean isFull(){
        return this.full;
    }

    public void eat(Plate plate, int food){

        if (plate.getFood() >= food && !this.full){
            plate.setFood(plate.getFood() - food);
            this.full = true;
            System.out.println(this.getName() + " ate food");
        }
        else {
            System.out.println(this.getName() + " didn't eat food");
        }
    }
}