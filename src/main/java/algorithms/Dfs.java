package algorithms;

import java.util.Stack;

public class Dfs<E> {
    private Stack<Node<E>> stack;

    public Dfs() {
        stack = new Stack<>();
    }

    public boolean search(Node<E> rootNode, E value) {
        if (value == null || rootNode == null) {
            return false;
        }

        stack.push(rootNode);
        while (stack.peek() != null) {
            Node<E> node = stack.pop();
            if (value.equals(node.getValue())) {
                return true;
            }
            if (node.getChildren() != null) {
                stack.addAll(node.getChildren());
            }
        }

        return false;
    }

    public boolean searchInCyclicGraph(Node<E> rootNode, E value) {
        if (value == null || rootNode == null) {
            return false;
        }

        stack.push(rootNode);
        while (stack.peek() != null) {
            Node<E> node = stack.pop();
            if (value.equals(node.getValue())) {
                return true;
            }
            node.setVisited(true);
            if (node.getChildren() != null) {
                for (Node<E> child : node.getChildren()) {
                    if (child != null && !child.isVisited()) {
                        stack.push(child);
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

        if (value.equals(node.getValue())) {
            return true;
        }
        for (Node<E> child : node.getChildren()) {
            if (recursionSearch(child, value)) {
                return true;
            }
        }

        return false;
    }

    public boolean recursionSearchInCyclicGraph(Node<E> node, E value) {
        if (value == null || node == null) {
            return false;
        }

        if (value.equals(node.getValue())) {
            return true;
        }
        node.setVisited(true);
        for (Node<E> child : node.getChildren()) {
            if (!child.isVisited() && recursionSearch(child, value)) {
                return true;
            }
        }

        return false;
    }

    public boolean recursionSearchInCyclicGraphWithColors(Node<E> node, E value) {
        if (value == null || node == null) {
            return false;
        }

        if (value.equals(node.getValue())) {
            return true;
        }
        node.setColor(Node.Color.grey);
        for (Node<E> child : node.getChildren()) {
            if (!child.isVisited() && recursionSearch(child, value)) {
                return true;
            }
        }

        return false;
    }
}
