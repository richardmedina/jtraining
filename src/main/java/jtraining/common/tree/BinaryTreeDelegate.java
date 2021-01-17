package jtraining.common.tree;

public interface BinaryTreeDelegate<TNode extends BinaryTreeNode> {
    void insert(TNode node);
    void DepthFirstSearch(TNode rootNode);
    void BreadthFirstSearch(TNode rootNode);
}
