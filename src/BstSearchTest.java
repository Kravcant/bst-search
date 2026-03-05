import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    private BinaryTreeNode<Integer> buildTree() {
        BinaryTreeNode<Integer> two   = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> four  = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> six   = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> eight = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> three = new BinaryTreeNode<>(3, two, four);
        BinaryTreeNode<Integer> seven = new BinaryTreeNode<>(7, six, eight);
        return new BinaryTreeNode<>(5, three, seven);
    }

    @Test
    public void testNullRootReturnsFalse() {
        assertFalse(BstSearch.contains(null, 5));
    }

    @Test
    public void testSingleNodeContainsRoot() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        assertTrue(BstSearch.contains(root, 1));
    }

    @Test
    public void testContainsLeftLeaf() {
        assertTrue(BstSearch.contains(buildTree(), 2));
    }

    @Test
    public void testContainsRightLeaf() {
        assertTrue(BstSearch.contains(buildTree(), 8));
    }

    @Test
    public void testValueNotInTree() {
        assertFalse(BstSearch.contains(buildTree(), 99));
    }
}
