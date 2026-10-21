import java.util.*;

class Teacher {
    String name;

    public Teacher(String name) {
     this.name = name;
    }

    public String getName() {
     return name;
    }
}

class Course {
    String courseName;

    public Course(String courseName) {
     this.courseName = courseName;
    }

    public String getCourseName() {
     return courseName;
    }
}

class Department {
    String deptName;
    List<Teacher> teachers;

    public Department(String deptName, List<Teacher> teachers) {
     this.deptName = deptName;
     this.teachers = teachers;
    }

    public void displayDept() {
        System.out.println("Department: " + deptName);
        for (Teacher t : teachers) {
         System.out.println("  Teacher: " + t.getName());
        }
    }
}

class College {
    String collegeName;
    List<Department> departments;

    public College(String collegeName) {
     this.collegeName = collegeName;
     this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName, List<Teacher> teachers) {
     departments.add(new Department(deptName, teachers));
    }

    public void displayCollege() {
        System.out.println("College: " + collegeName);
        for (Department d : departments) {
         d.displayDept();
        }
    }
}

class Student {
    String studentName;
    List<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
     courses.add(course);
    }

    public void displayStudent() {
        System.out.println("Student: " + studentName);
        System.out.print("Enrolled Courses: ");
        for (Course c : courses) {
         System.out.print(c.getCourseName() + " ");
        }
        System.out.println();
    }
}

public class Practical5 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alice");
        Teacher t2 = new Teacher("Bob");

        List<Teacher> csTeachers = new ArrayList<>();
        csTeachers.add(t1);
        csTeachers.add(t2);

        College college = new College("Tech University");
        college.addDepartment("Computer Science", csTeachers);

        Course c1 = new Course("Java Programming");
        Course c2 = new Course("Database Systems");

        Student student = new Student("John");
        student.enrollCourse(c1);
        student.enrollCourse(c2);

        college.displayCollege();
        System.out.println();
        student.displayStudent();
    }
}
