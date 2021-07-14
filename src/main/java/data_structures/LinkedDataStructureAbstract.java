package data_structures;

import java.util.LinkedList;
import java.util.List;

public abstract class LinkedDataStructureAbstract<E> implements LinkedDataStructure<E> {
    protected List<E> linkedList;

    public LinkedDataStructureAbstract() {
        linkedList = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        linkedList.add(e);
    }

    public int size() {
        return linkedList.size();
    }
}
