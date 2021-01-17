package jtraining.common.tree;

import jtraining.impl.tree.BinaryTree;

public abstract class BinaryTreeNode<TValue> {
    private TValue value;
    private BinaryTreeNode leftNode;
    private BinaryTreeNode rightNode;

    public BinaryTreeNode(TValue value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public abstract int compare(BinaryTreeNode<TValue> node);

    public TValue getValue() {
        return value;
    }

    public void setValue(TValue value) {
        this.value = value;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
