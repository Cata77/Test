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
            System.out.println("This person is tall");
        else System.out.println("This person is short");
    }

    public void checkNationality() {
        if (this.nationality.equals("german"))
            System.out.println("This person is from Germany");
        else System.out.println("This person is not from Germany");
    }
}