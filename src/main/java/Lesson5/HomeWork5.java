package Lesson5;

public class HomeWork5 {


    public static void main(String[] args) {

        Assistant assistant1 = new Assistant("Петров Петр Петрович", "Инженер", "@petrov.ru", 89277333333l, 45000, 48);
        System.out.println("Сотрудник: " + Assistant.getAssistantCount());
        assistant1.print1();
        Assistant assistant2 = new Assistant("Иванов Иван Иванович", "Технолог", "@ivanov.ru", 89277775547l, 30000, 39);
        System.out.println("Сотрудник: " + Assistant.getAssistantCount());
        assistant2.print1();
        Assistant assistant3 = new Assistant("Сидоров Сидр Сидорович", "Проектант", "@sidorod.ru", 89278885544l, 35000, 36);
        System.out.println("Сотрудник: " + Assistant.getAssistantCount());
        assistant3.print1();
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Вячеслав Кобрин", "Генеральный директор", "vk@primer,ru", "+79996665544", 250000, 55);
        persArray[1] = new Employee("Иван Зайцев", "Директор по развитию", "vz@primer,ru", "+79998884455", 127000, 47);
        persArray[2] = new Employee("Дмитрий Медведев", "Охранник", "dm@primer,ru", "+79997771234", 19000, 27);
        persArray[3] = new Employee("Олеся Лисина", "Ведущий разработчик", "ol@primer,ru", "+79995554789", 120000, 28);
        persArray[4] = new Employee("Кристина Волкова", "Директор по работе с клиентами", "kv@primer,ru", "+79994445896", 138000, 48);
        // если у объекта в ячейке i поле age > 40, то у него вызывается метод print()
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) persArray[i].print();
        }
    }
}


