package com.self.struct;

/**
 * @author shaojieyue
 * Created at 2020-07-12 10:00
 */

public class Node<V> {
    private V value;
    private Node<V> next;

    public static final Node buildNode(Object value) {
        return new Node(value);
    }

    public Node(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
