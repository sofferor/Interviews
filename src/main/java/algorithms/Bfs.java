package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs<E> {
    Queue<Node<E>> queue;

    public Bfs() {
        queue = new LinkedList<>();
    }

    public boolean search(Node<E> rootNode, E value) {
        if (value == null || rootNode == null) {
            return false;
        }
        queue.add(rootNode);
        while (queue.peek() != null) {
            Node<E> currNode = queue.poll();
            if (currNode.getValue().equals(value)) {
                return true;
            }
            if (currNode.getChildren() != null) {
                queue.addAll(currNode.getChildren());
            }
        }
        return false;
    }

    public boolean searchInCyclicGraph(Node<E> rootNode, E value) {
        if (value == null || rootNode == null) {
            return false;
        }
        queue.add(rootNode);
        while (queue.peek() != null) {
            Node<E> currNode = queue.poll();
            if (currNode.getValue().equals(value)) {
                return true;
            }
            currNode.setVisited(true);
            if (currNode.getChildren() != null) {
                for (Node<E> child :
                        currNode.getChildren()) {
                    if (child != null && !child.isVisited()) {
                        queue.add(child);
                    }
                }
            }
        }
        return false;
    }

    public boolean recursionSearch(Node<E> node, E value) {
        if (value == null || node == null) {
            return false;
        }

        List<Node<E>> nodesLevel = new ArrayList<>();
        nodesLevel.add(node);

        return recursionSearchBFS(nodesLevel, value);
    }

    private boolean recursionSearchBFS(List<Node<E>> nodesLevel, E value) {
        List<Node<E>> nodesNextLevel = new ArrayList<>();
        for (Node<E> node :
                nodesLevel) {
            if (value.equals(node.getValue())) {
                return true;
            }
            if (node.getChildren() != null) {
                nodesNextLevel.addAll(node.getChildren());
            }
        }

        if (nodesNextLevel.size() == 0) {
            return false;
        }

        return recursionSearchBFS(nodesNextLevel, value);
    }
}
