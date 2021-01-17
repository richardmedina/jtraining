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
            IntBinaryTreeNode ant = null;

            while(aux != null){
                ant = aux;
                if(node.compare(aux) == 1){
                    aux = (IntBinaryTreeNode) aux.getRightNode();
                    if(aux == null) ant.setRightNode(node);
                }
                else {
                    aux = (IntBinaryTreeNode) aux.getLeftNode();
                    if(aux == null) ant.setLeftNode(node);
                }
            }
        }
    }

    @Override
    public void DepthFirstSearch(IntBinaryTreeNode rootNode) {

    }

    @Override
    public void BreadthFirstSearch(IntBinaryTreeNode rootNode) {

    }
}
