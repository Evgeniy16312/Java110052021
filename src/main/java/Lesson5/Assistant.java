package Lesson5;

public class Assistant {
    private static int assistantCount = 0;
    private String fio;
    private String post;
    private String email;
    private long number;
    private int salary;
    private int age;

    public static int getAssistantCount() {
        return assistantCount;
    }

    public static void setAssistantCount(int assistantCount) {
        Assistant.assistantCount = assistantCount;
    }

    Assistant(String fio, String post, String email, long number, int salary, int age) {
        assistantCount++;
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println(" Неверно указан возраст");
        } else {
            this.age = age;
        }
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void print() {
        System.out.println(this);
    }
}
