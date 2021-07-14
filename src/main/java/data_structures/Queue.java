package data_structures;

import questions.linked_lists.Node;

import java.util.LinkedList;
import java.util.List;

public class Queue<E> implements LinkedDataStructure<E> {
    protected List<E> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void push(E e) {
        queue.add(e);
    }

    public E peek() {
        return queue.get(0);
    }

    public E pop() {
        return queue.remove(0);
    }

    @Override
    public int size() {
        return queue.size();
    }
}
