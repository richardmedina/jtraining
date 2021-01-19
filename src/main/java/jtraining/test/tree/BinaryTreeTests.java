package jtraining.test.tree;

import jtraining.impl.tree.BinaryTree;
import jtraining.impl.tree.IntBinaryTreeNode;
import org.junit.Test;

public class BinaryTreeTests {

    @Test
    public void BinaryTreeTest_Insert(){
        BinaryTree tree = new BinaryTree();
        IntBinaryTreeNode node1 = new IntBinaryTreeNode(10);
        IntBinaryTreeNode node2 = new IntBinaryTreeNode(5);
        IntBinaryTreeNode node3 = new IntBinaryTreeNode(20);
        IntBinaryTreeNode node4 = new IntBinaryTreeNode(1);

        tree.insert(node1);
        tree.insert(node2);
        tree.insert(node3);
        tree.insert(node4);

        System.out.println("Nothing to do here");
    }

    @Test
    public void BinaryTreeTest_DepthFirstSearch(){
        BinaryTree tree = new BinaryTree();
        IntBinaryTreeNode node1 = new IntBinaryTreeNode(10);
        IntBinaryTreeNode node2 = new IntBinaryTreeNode(5);
        IntBinaryTreeNode node3 = new IntBinaryTreeNode(20);
        IntBinaryTreeNode node4 = new IntBinaryTreeNode(1);

        tree.insert(node1);
        tree.insert(node2);
        tree.insert(node3);
        tree.insert(node4);

        tree.DepthFirstSearch();
    }

    @Test
    public void BinaryTreeTest_BreadthFirstSearch(){
        BinaryTree tree = new BinaryTree();
        IntBinaryTreeNode node1 = new IntBinaryTreeNode(10);
        IntBinaryTreeNode node2 = new IntBinaryTreeNode(5);
        IntBinaryTreeNode node3 = new IntBinaryTreeNode(20);
        IntBinaryTreeNode node4 = new IntBinaryTreeNode(1);

        tree.insert(node1);
        tree.insert(node2);
        tree.insert(node3);
        tree.insert(node4);

        tree.BreadthFirstSearch();
    }
}
