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
        depthFirstSearch(root);
    }

    private void depthFirstSearch(IntBinaryTreeNode node){
        if(node != null){
            var leftNode = (IntBinaryTreeNode) node.getLeftNode();
            var rightNode = (IntBinaryTreeNode) node.getRightNode();

            System.out.print(node.getValue() + ",");
            depthFirstSearch(leftNode);
            depthFirstSearch(rightNode);
        }
    }

    @Override
    public void BreadthFirstSearch() {
        if(root != null) {
            System.out.print(root.getValue() + ",");
        }

        breadthFirstSearch(root);
    }

    private void breadthFirstSearch(IntBinaryTreeNode node){
        if(node != null){
            var leftNode = (IntBinaryTreeNode) node.getLeftNode();
            var rightNode = (IntBinaryTreeNode) node.getRightNode();

            if(leftNode != null) System.out.print(leftNode.getValue() + ",");
            if(rightNode != null) System.out.print(rightNode.getValue() + ",");

            breadthFirstSearch(leftNode);
            breadthFirstSearch(rightNode);
        }
    }
}
