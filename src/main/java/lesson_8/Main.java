package lesson_8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WordsCheck.checkWords();
        Phonebook phonebook = new Phonebook();
        phonebook.add(new Person("Kartohin", List.of("+375331111111", "+375332222222")));
        phonebook.add(new Person("Zrazov", List.of("+375333333333", "+375334444444")));
        phonebook.add(new Person("Kartohin", List.of("+375335555555")));

        phonebook.get("kartohin");
    }
}