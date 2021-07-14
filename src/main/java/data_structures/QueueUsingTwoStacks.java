package data_structures;

public class QueueUsingTwoStacks<E> {
    Stack<E> regularStack;
    Stack<E> reversedStack;

    public QueueUsingTwoStacks() {
        regularStack = new Stack<>();
        reversedStack = new Stack<>();
    }

    public void push(E e) {
        reversedStack.push(e);
    }

    public E peek() {
        E e = null;
        if (reversedStack.size() != 0) {
            e = reversedStack.peek();
        } else if (regularStack.size() != 0) {
            shiftStacks();
            e = reversedStack.peek();
        }
        return e;
    }

    private void shiftStacks() {
        while (regularStack.peek() != null) {
            reversedStack.push(regularStack.pop());
        }
    }

    public E pop() {
        E e = null;
        if (reversedStack.size() != 0) {
            e = reversedStack.pop();
        } else if (regularStack.size() != 0) {
            shiftStacks();
            e = reversedStack.pop();
        }
        return e;
    }
}
