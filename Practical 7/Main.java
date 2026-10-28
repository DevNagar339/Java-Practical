import java.util.*;

class Box<T> {
    private T value;

    Box(T value) {
     this.value = value;
    }

    void setValue(T value) {
     this.value = value;
    }

    T getValue() {
     return value;
    }

    void display() {
     System.out.println("Value: " + value);
    }
}

public class Main {
    
    static <T> void show(T data) {
     System.out.println("Data: " + data);
    }

    // Bounded generic method
    static <T extends Number> void square(T num) {
     double n = num.doubleValue();
     System.out.println("Square: " + (n * n));
    }

    static void displayNumbers(
            Box<? extends Number> box) {
        System.out.println(
            "Number: " + box.getValue());
    }

    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>(100);
        b1.display();

       
        Box<String> b2 = new Box<>("Hello Java");
        b2.display();

        b1.setValue(200);
        System.out.println("Updated: " + b1.getValue());

        show(50);
        show("Generics in Java");
        show(12.5);

        square(5);
        square(4.5);

       
        Box<Double> b3 = new Box<>(25.5);
        displayNumbers(b3);
    }
}

