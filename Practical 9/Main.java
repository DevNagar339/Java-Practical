import java.util.*;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
     this.data = data;
     next = null;
    }
}

class LinkedList<T> {
    Node<T> head;
    int count = 0;

    void insert(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
         head = newNode;
        } else {
         Node<T> temp = head;

         while (temp.next != null) {
           temp = temp.next;
           }

            temp.next = newNode;
        }

        count++;
        System.out.println(data + " inserted");
    }

    void delete(T data) {
        if (head == null) {
          System.out.println("List is empty");
          return;
        }

        if (head.data.equals(data)) {
         head = head.next;
          count--;
          System.out.println(data + " deleted");
          return;
        }

        Node<T> temp = head;

        while (temp.next != null &&
         !temp.next.data.equals(data)) {
          temp = temp.next;
        }

        if (temp.next == null) {
          System.out.println("Element not found");
        } else {
          temp.next = temp.next.next;
          count--;
          System.out.println(data + " deleted");
        }
    }

    void search(T data) {
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data.equals(data)) {
              System.out.println(data + " found");
              return;
            }
            temp = temp.next;
        }

        System.out.println(data + " not found");
    }

    void display() {
        if (head == null) {
          System.out.println("List is empty");
          return;
        }

        Node<T> temp = head;
        System.out.print("List: ");

        while (temp != null) {
          System.out.print(temp.data + " ");
          temp = temp.next;
        }

        System.out.println();
    }

    int size() {
      return count;
    }

    boolean isEmpty() {
      return head == null;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();

        list.search(20);

        list.delete(20);
        list.display();

        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());

        LinkedList<String> names = new LinkedList<>();

        names.insert("Amit");
        names.insert("Rahul");
        names.display();
    }
}

