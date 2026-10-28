import java.util.*;

interface Printable {
 void display();
}

abstract class Person {
  protected String name;

  Person(String name) {
    this.name = name;
  }

 abstract void showRole();
}

class Student extends Person implements Printable {
    private int rollNo;
    private String course;

    Student(int rollNo, String name, String course) {
     super(name);
      this.rollNo = rollNo;
      this.course = course;
    }

    int getRollNo() {
      return rollNo;
    }

    void showRole() {
      System.out.println("Role: Student");
    }

    public void display() {
      System.out.println("Roll No: " + rollNo);
      System.out.println("Name: " + name);
      System.out.println("Course: " + course);
    }
}


class Repository<T> {
    private ArrayList<T> list = new ArrayList<>();

    void add(T item) {
      list.add(item);
    }

    void showAll() {
        for (T item : list) {
        System.out.println(item);
        }
    }

    int size() {
    return list.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Repository<Student> students = new Repository<>();

        try {
            Student s1 = new Student(
           101, "Mohan", "BTECH");

            Student s2 = new Student(
           102, "Ram", "BTECH");

            students.add(s1);
            students.add(s2);

            System.out.println("Student Records:");

            s1.showRole();
            s1.display();

            System.out.println();

            s2.display();

            System.out.println("\nTotal Students: " + students.size());

        } catch (Exception e) {
          System.out.println("Error: " + e.getMessage());
        } finally {
          System.out.println( "Program completed.");
        }
    }
}

