import java.util.*;
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    int rollNumber;
    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Roll Number: " + rollNumber);
    }
}
class GraduateStudent extends Student {
    String researchArea;

    public GraduateStudent(String name, int age, int rollNumber, String researchArea) {
        super(name, age, rollNumber);
        this.researchArea = researchArea;
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Research Area: " + researchArea);
    }
}
class Faculty extends Person {
    String department;
    public Faculty(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}


public class Practical2 {
    public static void main(String[] args) {
        System.out.println("Student Details (Single Inheritance)");
        Student s = new Student("Mohan", 19, 67);
        s.display();

        System.out.println("\n Graduate Student Details (Multilevel Inheritance)");
        GraduateStudent gs = new GraduateStudent("Ram", 20, 68, "Artificial Intelligence and Data Science");
        gs.display();

        System.out.println("\n Faculty Details");
        Faculty f = new Faculty("Dr. Sohan", 45, "Computer Science");
        f.display();
    }
}
