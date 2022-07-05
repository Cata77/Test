package Test;

public class Person {
    int age;
    String name;
    String nationality;
    double height;

    public Person(int age, String name, String nationality, double height) {
        this.age = age;
        this.name = name;
        this.nationality = nationality;
        this.height = height;
    }

    public void checkHeight() {
        if (this.height > 1.7)
            System.out.println("tall");
        System.out.println("short");
    }
}
