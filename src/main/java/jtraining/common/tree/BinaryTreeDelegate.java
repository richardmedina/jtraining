package jtraining.common.tree;

public interface BinaryTreeDelegate<TNode extends BinaryTreeNode> {
    void insert(TNode node);
    void DepthFirstSearch();
    void BreadthFirstSearch();
}
