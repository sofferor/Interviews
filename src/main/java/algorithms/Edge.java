package algorithms;

import java.util.Objects;

public class Edge<E> {
    Node<E> source;
    Node<E> dest;
    Integer wight;

    public Edge(Node<E> source, Node<E> dest) {
        this.source = source;
        this.dest = dest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge<?> edge = (Edge<?>) o;
        return Objects.equals(source, edge.source) &&
                Objects.equals(dest, edge.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, dest);
    }

    public Node<E> getSource() {
        return source;
    }

    public void setSource(Node<E> source) {
        this.source = source;
    }

    public Node<E> getDest() {
        return dest;
    }

    public void setDest(Node<E> dest) {
        this.dest = dest;
    }

    public Integer getWight() {
        return wight;
    }

    public void setWight(Integer wight) {
        this.wight = wight;
    }
}
