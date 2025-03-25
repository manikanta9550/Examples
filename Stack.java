import java.util.*;

class StackImplementation {
    ArrayList<Integer> list;

    StackImplementation() {
        list = new ArrayList<>();
    }

    public void push(int element) {
        list.add(element);
    }

    public int peek() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return list.get(list.size() - 1);
    }

    public int pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        }
        return list.remove(list.size() - 1);
    }
}

public class Stack {  
    public static void main(String[] args) {
        StackImplementation s = new StackImplementation();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Top element (peek): " + s.peek());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Top element after pop (peek): " + s.peek());
    }
}
