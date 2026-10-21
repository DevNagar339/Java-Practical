import java.util.*;
class Shape {
    void draw() {
     System.out.println("Drawing a generic shape");
    }

    void draw(int count) {
      for (int i = 0; i < count; i++) {
       System.out.println("Drawing shape number " + (i + 1));
        }
    }
}

class Circle extends Shape {
 @Override
  void draw() {
   System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
 @Override
 void draw() {
   System.out.println("Drawing a Rectangle");
  }
}

public class Practical3 {
  public static void main(String[] args) {
    System.out.println("Compile-Time Polymorphism (Overloading");
     Shape s = new Shape();
     s.draw();
     s.draw(2);

     System.out.println("\nRun-Time Polymorphism (Overriding)");
     Shape ref;

     ref = new Circle();
     ref.draw();

     ref = new Rectangle();
     ref.draw();
    }
}
