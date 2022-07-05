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

    public void checkAge() {
        if (this.age > 18)
            System.out.println("This person is an adult");
        else System.out.println("This person is a child");
    }
}
