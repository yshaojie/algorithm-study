package com.self.alg.tree;

import com.self.struct.TreeNode;

import java.util.Objects;

/**
 *
 * 前序遍历
 * 根节点放在左节点的左边
 * @author shaojieyue
 * Created at 2020-07-17 18:03
 */

public class PreOrderTraver implements Traver{
    @Override
    public void traver(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.getValue());
        final TreeNode leftNode = treeNode.getLeft();
        if (Objects.nonNull(leftNode)) {
            traver(leftNode);
        }

        final TreeNode rightNode = treeNode.getRight();
        if (Objects.nonNull(rightNode)) {
            traver(rightNode);
        }

    }
}
