package lesson_4;

public abstract class Animal{
    private String name;

    abstract void run(int distance);
    abstract void swim(int distance);

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
