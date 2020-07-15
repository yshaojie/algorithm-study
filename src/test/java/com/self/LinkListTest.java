package com.self;

import com.self.struct.Node;

/**
 * @author shaojieyue
 * Created at 2020-07-13 11:25
 */
public class LinkListTest {
    public static void main(String[] args) {

        final Node node1 = Node.buildNode(1);
        final Node node2 = Node.buildNode(2);
        final Node node3 = Node.buildNode(3);
        final Node node4 = Node.buildNode(4);
        final Node node5 = Node.buildNode(5);
        final Node node6 = Node.buildNode(6);
        node1.setNext(node2);
        node2.setNext(node5);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node3);
        Node node = node1;
        do {
            System.out.println(node.getValue());
            node = node.getNext();
        } while (node != null);
    }
}
