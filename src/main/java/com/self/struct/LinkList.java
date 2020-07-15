package com.self.struct;

/**
 * @author shaojieyue
 * Created at 2020-07-12 09:58
 */

public class LinkList<V> {
    private Node<V> head;

    public LinkList(Node<V> head) {
        this.head = head;
    }

    public static final LinkList buildLink(Node... nodes){
        if (nodes == null || nodes.length == 0) {
            return null;
        }
        Node previousNode = null;
        Node head = null;
        for (Node node : nodes) {
            if (node == null) {
                continue;
            }
            if (head == null) {
                head = node;
            }
//            node.setNext(null);
            if (previousNode == null) {
                previousNode = node;
                continue;
            }
            previousNode.setNext(node);
            previousNode = node;
        }
        return new LinkList(head);
    }

    public Node<V> getHead() {
        return head;
    }
}
