package lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public float getWeight() {
        float weight = 0;
        for (T fruit : this.list) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void addFruit(T t) {
        this.list.add(t);
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void moveTo(Box<T> box) {
        for (T fruit : this.list) {
            box.addFruit(fruit);
        }

        this.list.removeAll(this.list);
    }
}
