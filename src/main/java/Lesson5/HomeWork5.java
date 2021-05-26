package Lesson5;

public class HomeWork5 {



    public static void main(String[] args) {

        Assistant assistant1 = new Assistant("Петров Петр Петрович", "Инженер","@petrov.ru",89277333333l,45000,44);
        System.out.println("Сотрудник: " + Assistant.getAssistantCount());
        System.out.println("ФИО: " + assistant1.getFio() + " Должность: " + assistant1.getPost() + " Электронная почта: " + assistant1.getEmail() + " Номер телефона: " +assistant1.getNumber() + " Возраст: " + assistant1.getAge());
        Assistant assistant2 = new Assistant("Иванов Иван Иванович","Технолог","@ivanov.ru",89277775547l,30000,34);
        System.out.println("Сотрудник: " + Assistant.getAssistantCount());
        System.out.println("ФИО: " + assistant2.getFio() + " Должность: " + assistant2.getPost() + " Электронная почта: " + assistant2.getEmail() + " Номер телефона: " +assistant2.getNumber() + " Возраст: " + assistant2.getAge());
        Assistant assistant3 = new Assistant("Сидоров Сидр Сидорович","Проектант","@sidorod.ru",89278885544l,35000,36);
        System.out.println("Сотрудник: " + Assistant.getAssistantCount());
        System.out.println("ФИО: " + assistant3.getFio() + " Должность: " + assistant3.getPost() + " Электронная почта: " + assistant3.getEmail() + " Номер телефона: " +assistant3.getNumber() + " Возраст: " + assistant3.getAge());




    }


}
