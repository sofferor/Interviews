package questions.linked_lists;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
    public static <E> void removeDups(Node<E> node) {
        if (node == null || node.getNext() == null) {
            return;
        }
        Set<E> appearedNodes = new HashSet<>();
        Node<E> previousNode = null;
        while (node != null) {
            if (appearedNodes.contains(node.getValue())) {
                previousNode.setNext(node.getNext());
            }
            node = node.getNext();
        }
    }
}
