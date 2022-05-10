package lesson_8;

import java.util.List;

public class Person {
    private String surname;
    private List<String> numbers;

    public Person(String surname, List<String> numbers) {
        this.surname = surname;
        this.numbers = numbers;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", numbers=" + numbers +
                '}';
    }
}
