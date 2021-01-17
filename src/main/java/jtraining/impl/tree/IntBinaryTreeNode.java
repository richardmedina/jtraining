package jtraining.impl.tree;

import jtraining.common.tree.BinaryTreeNode;

public class IntBinaryTreeNode extends BinaryTreeNode<Integer> {
    public IntBinaryTreeNode(int i) {
        super(i);
    }

    @Override
    public int compare(BinaryTreeNode<Integer> node) {
        if(this.getValue() == node.getValue()) return 0;
        if(this.getValue() < node.getValue()) return -1;
        return 1;
    }
}
