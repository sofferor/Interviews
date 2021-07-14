package data_structures;

public class Dequeue<E> extends Queue<E> {
    public Dequeue() {
        super();
    }

    public void pushFirst(E e) {
        queue.add(0, e);
    }

    public E peekLast() {
        return queue.get(queue.size() - 1);
    }

    public E removeLast() {
        return queue.remove(queue.size() - 1);
    }
}
