package lesson_8;

import java.util.*;

public class Phonebook {
    private List<Person> phoneBook = new ArrayList<>();

    public void get(String surname) {
        for (Person p : phoneBook) {
            if (p.getSurname().equalsIgnoreCase(surname)) {
                System.out.println(p);
            }
        }
    }

    public void add(Person person) {
        phoneBook.add(person);
    }
}
