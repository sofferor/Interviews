package data_structures;

import java.util.LinkedList;
import java.util.List;

public class ListOfStack<E> extends Stack<E> {
    List<Stack<E>> stackList;
    final int maxStackSize = 4;

    public ListOfStack() {
        stackList = new LinkedList<>();
        stackList.add(new Stack<>());
    }

    @Override
    public E peek() {
        return stackList.get(stackList.size() - 1).peek();
    }

    @Override
    public E pop() {
        return stackList.remove(stackList.size() - 1).pop();
    }

    @Override
    public void push(E e) {
        if (stackList.get(stackList.size() - 1).size() == maxStackSize) {
            stackList.add(new Stack<>());
        }
        stackList.get(stackList.size() - 1).push(e);
    }
}
