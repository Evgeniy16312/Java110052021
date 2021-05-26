package Lesson5;

public class Employee {
    // это поля класса
    String name; //ФИО
    String position; //должность
    String email; //емейл
    String phone_number; //номер телефона
    int salary; //зарплата
    int age; //возраст

    // это конструктор
    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    // это переопределенный метод
    @Override
    public String toString() {
        return String.format("Имя: %s \t Должность: %s \n Email: %s \t Номер телефона: %s \n Зарплата: %d руб. \t  Возраст: %d лет. \n ",
                name, position, email, phone_number, salary, age);
    }

    // это метод вывода в консоль (как по заданию)
    public void print() {
        System.out.println(this);
    }


}
