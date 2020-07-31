package com.self.struct;

/**
 * @author shaojieyue
 * Created at 2020-07-17 18:47
 */

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree(int value) {
        this.root = new TreeNode(value);
    }

    public void addNode(int newValue) {
        addNode(root, newValue);
    }

    private void addNode(TreeNode root, int newValue) {
        if (root.getValue() > newValue) {
            final TreeNode left = root.getLeft();
            if (left == null) {
                root.setLeft(new TreeNode(newValue));
            }else {
                addNode(left,newValue);
            }
        }
        if (root.getValue() < newValue) {
            final TreeNode right = root.getRight();
            if (right == null) {
                root.setRight(new TreeNode(newValue));
            }else {
                addNode(right,newValue);
            }
        }
    }

    public TreeNode getRoot() {
        return root;
    }
}
