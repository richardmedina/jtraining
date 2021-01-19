package jtraining.impl.tree;

import jtraining.common.tree.BinaryTreeDelegate;

public class BinaryTree implements BinaryTreeDelegate<IntBinaryTreeNode> {
    private IntBinaryTreeNode root = null;

    @Override
    public void insert(IntBinaryTreeNode node) {
        if (root == null) {
            root = node;
        }
        else {
            IntBinaryTreeNode aux = root;
            IntBinaryTreeNode parent = null;

            while(aux != null){
                parent = aux;
                if(node.compare(aux) == 1){
                    aux = (IntBinaryTreeNode) aux.getRightNode();
                    if(aux == null) parent.setRightNode(node);
                }
                else {
                    aux = (IntBinaryTreeNode) aux.getLeftNode();
                    if(aux == null) parent.setLeftNode(node);
                }
            }
        }
    }

    @Override
    public void DepthFirstSearch() {

    }

    @Override
    public void BreadthFirstSearch() {

    }
}
