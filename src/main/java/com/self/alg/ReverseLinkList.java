package com.self.alg;

import com.self.struct.Node;

/**
 * @author shaojieyue
 * Created at 2020-07-13 14:24
 */

public class ReverseLinkList {
    /**
     * 递归翻转链表
     * @param node
     * @return
     */
    public static Node recursiveReverse(Node node) {
        if (node == null || node.getNext() == null) {
            return node;
        }
        final Node newHead = recursiveReverse(node.getNext());
        node.getNext().setNext(node);
        node.setNext(null);
        return newHead;
    }

    /**
     * 非递归翻转
     * @param node
     * @return
     */
    public static Node loopReverse(Node node) {
        Node newHead = null;
        while (node != null) {
            final Node tmp = node.getNext();
            node.setNext(newHead);
            newHead = node;
            node = tmp;
        }
        return newHead;
    }
}
