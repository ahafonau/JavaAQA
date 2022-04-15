package lesson_3;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public static void information() {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Borodach Alexander Ivanovich", "Project Manager", "test1@mailbox.com", "+375291111111", 700, 41);
        empArray[1] = new Employee("Vasilkov Mihail Nazarovich", "Java Developer", "test2@mailbox.com", "+375292222222", 3000, 38);
        empArray[2] = new Employee("Markov Vadim Maximovich", "JS Developer", "test3@mailbox.com", "+375293333333", 4000, 31);
        empArray[3] = new Employee("Agafonov Ivan Valer'evich", "QA Engineer", "test4@mailbox.com", "+375294444444", 2000, 25);
        empArray[4] = new Employee("Borzenkov Ivan Vadimovich", "QA Engineer", "test5@mailbox.com", "+375295555555", 100, 60);

        for (Employee employee : empArray)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }

    @Override
    public String toString() {
        return "-- Employee Information --" + '\n' +
                "full name: " + fullName + '\n' +
                "position: " + position + '\n' +
                "email: " + email + '\n' +
                "phone: " + phone + '\n' +
                "salary: " + salary + "$" + '\n' +
                "age: " + age + '\n';
    }
}