import java.util.*;

class QueueImplementation {
    ArrayList<Integer> list;

    QueueImplementation() {
        list = new ArrayList<>();
    }

    public void enqueue(int element) {
        list.add(element);
    }

    public int peek() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return list.get(0);
    }

    public int dequeue() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        }
        return list.remove(0);
    }
}

public class Queue {  
    public static void main(String[] args) {
        QueueImplementation s = new QueueImplementation();
        s.enqueue(1);
        s.enqueue(14);
        s.enqueue(13);
        s.enqueue(12);

        System.out.println("Top element (peek): " + s.peek());
        System.out.println("Popped element: " + s.dequeue());
        System.out.println("Top element after pop (peek): " + s.peek());
      
    }
}
