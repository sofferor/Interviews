package data_structures;

public class Stack<E> extends LinkedDataStructureAbstract<E> {
    @Override
    public E peek() {
        return linkedList.get(linkedList.size() - 1);
    }

    @Override
    public E pop() {
        return linkedList.remove(linkedList.size() - 1);
    }
}
