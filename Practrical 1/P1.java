import java.util.*;
class Student {
    private String name;
    private int age;
    private double marks;

    public Student() {
        this.name = "Unknown";
        this.age = 18;
        this.marks = 0.0;
    }
    public Student(String name, int age, double marks) {
        setName(name);
        setAge(age);
        setMarks(marks);
    }
    public Student(String name, int age) {
        setName(name);
        setAge(age);
        this.marks = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Invalid Name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println(" Invalid age provided! Setting default age to 18.");
            this.age = 18;
        }
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0.0 && marks <= 100.0) {
            this.marks = marks;
        } else {
            System.out.println(" Invalid marks provided! Marks must be between 0 and 100.");
        }
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name + " Age: " + age + " Marks: " + marks);
    }
}

public class Practical1Demo {
    public static void main(String[] args) {
        System.out.println(" Practical 1 ");

        Student s1 = new Student();
        System.out.print("1. Default Constructor = ");
        s1.displayDetails();

        Student s2 = new Student("Alice", 20, 88.5);
        System.out.print("2. Parameterized Constructor = ");
        s2.displayDetails();

        Student s3 = new Student("Bob", 22);
        System.out.print("3. Overloaded Constructor = ");
        s3.displayDetails();

        System.out.println("\nTesting Setters and Validation");
        System.out.println("Trying to set invalid marks (105.0) for Bob:");
        s3.setMarks(105.0); // Triggers validation error message
        
        System.out.println("Setting valid marks (92.5) for Bob:");
        s3.setMarks(92.5);
        
        System.out.print("Updated Details = ");
        s3.displayDetails();
    }
}

