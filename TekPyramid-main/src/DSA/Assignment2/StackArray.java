package DSA.Assignment2;

public class StackArray {
    int[] stack;
    int top;

    //constructor to initialize non-static variables
    public StackArray(int size) {
        stack = new int[size];
        top = -1;
    }

    //push operation
    public void push(int x) {
        if (isFull()) {
            System.out.println("Cannot push — Stack Overflow");
        }
        stack[++top] = x;
        System.out.println(x + " pushed");
    }

    //pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Cannot pop — Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    //peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Cannot peek — Stack is empty");
            return -1;
        }
        return stack[top];
    }

    //To check stack is Empty or not
    public boolean isEmpty() {
        return top == -1;
    }

    //To check stack is Full or not
    public boolean isFull() {
        return top == stack.length - 1;
    }

    // main
    public static void main(String[] args) {
        StackArray s = new StackArray(3);

        System.out.println("Is Empty? " + s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40); // overflow test
        System.out.println("Peek: " + s.peek());
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop()); // underflow test
        System.out.println("Peek: " + s.peek());
        System.out.println("Is Empty? " + s.isEmpty());
    }
}