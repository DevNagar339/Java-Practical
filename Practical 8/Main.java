import java.util.*;

class Stack {
    int arr[] = new int[5];
    int top = -1;

    void push(int x) {
        if (top == 4) {
         System.out.println("Stack Overflow");
        } else {
         arr[++top] = x;
         System.out.println(x + " pushed");
        }
    }

    void pop() {
        if (top == -1) {
         System.out.println("Stack Underflow");
        } else {
         System.out.println(arr[top--] + " popped");
        }
    }

    void peek() {
        if (top == -1)
         System.out.println("Stack is empty");
        else
         System.out.println("Top: " + arr[top]);
    }

    void display() {
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--)
          System.out.print(arr[i] + " ");
        System.out.println();
    }
}

class Queue {
    int arr[] = new int[5];
    int front = 0, rear = -1;

    void enqueue(int x) {
        if (rear == 4) {
         System.out.println("Queue Overflow");
        } else {
         arr[++rear] = x;
         System.out.println(x + " inserted");
        }
    }

    void dequeue() {
        if (front > rear) {
         System.out.println("Queue Underflow");
        } else {
         System.out.println(arr[front++] + " removed");
        }
    }

    void display() {
        if (front > rear) {
         System.out.println("Queue is empty");
         return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++)
         System.out.print(arr[i] + " ");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
     Stack s = new Stack();

     System.out.println("STACK OPERATIONS");
      s.push(10);
      s.push(20);
      s.push(30);
      s.display();
      s.peek();
      s.pop();
      s.display();

     Queue q = new Queue();

     System.out.println("\nQUEUE OPERATIONS");
     q.enqueue(40);
     q.enqueue(50);
     q.enqueue(60);
     q.display();
     q.dequeue();
     q.display();
    }
}

