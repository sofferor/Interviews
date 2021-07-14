package data_structures;

public interface LinkedDataStructure<E> {
    void push(E e);

    E peek();

    E pop();

    int size();
}
