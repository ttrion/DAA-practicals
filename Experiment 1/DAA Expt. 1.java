/*
Aim: Analyze if the stack is empty or full, and if elements are present, return the top 
element in the stack using templates. Also, perform push and pop operations on the stack.
*/

class Stack<T> {
    private T[] stackArray;
    private int top;
    private int capacity;

    public Stack(int size) {
        this.capacity = size;
        this.stackArray = (T[]) new Object[capacity];
        this.top = -1;
    }

    public void push(T element) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = element;
        System.out.println("Pushed: " + element);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        T poppedElement = stackArray[top--];
        System.out.println("Popped: " + poppedElement);
        return poppedElement;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>(5);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("Top element is: " + intStack.peek());
        System.out.println("Stack empty? " + intStack.isEmpty());
        System.out.println("Stack full? " + intStack.isFull());

        intStack.pop();
        intStack.pop();
        intStack.pop();
        intStack.pop();
    }
}