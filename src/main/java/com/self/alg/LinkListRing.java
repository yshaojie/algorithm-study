package com.self.alg;

import com.self.struct.Node;

/**
 * 采用追逐法判断链表是否有环
 * @author shaojieyue
 * Created at 2020-07-13 12:47
 */

public class LinkListRing {
    public static final boolean hasRing(Node node) {
        if (node == null || node.getNext() == null) {
            return true;
        }
        Node fast = node;
        Node slow = node;
        while (slow != null){
            slow = slow.getNext();
            fast = fast.getNext();

            if (slow == null || fast == null || fast.getNext() == null) {
                return false;
            }
            System.out.println(slow.getValue());
            fast = fast.getNext();
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
