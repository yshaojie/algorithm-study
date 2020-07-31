package com.self.alg.tree;

import com.self.struct.TreeNode;

import java.util.Objects;

/**
 * 中序遍历
 * 根节点放在左节点和右节点中间
 * @author shaojieyue
 * Created at 2020-07-17 19:05
 */

public class InOrderTraver implements Traver {
    @Override
    public void traver(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        final TreeNode left = treeNode.getLeft();
        if (Objects.nonNull(left)) {
            traver(left);
        }
        System.out.println(treeNode.getValue());
        final TreeNode right = treeNode.getRight();
        if (Objects.nonNull(right)) {
            traver(right);
        }
    }
}
