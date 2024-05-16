class BNode6 {
    int info;
    BNode6 left, right;

    public BNode6(int info) {
        this.info = info;
        left = null;
        right = null;
    }
}

class BST6 {
    BNode6 root;

    public BST6() {
        root = null;
    }

    public boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(BNode6 node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.info < min || node.info > max) {
            return false;
        }

        return isBSTUtil(node.left, min, node.info - 1) && isBSTUtil(node.right, node.info + 1, max);
    }

    // Other methods...
}

public class Q6{
	public static void main(String[] args) {
	    // Constructing a binary tree
	    BST6 bst = new BST6();
	    bst.root = new BNode6(4);
	    bst.root.left = new BNode6(2);
	    bst.root.right = new BNode6(5);
	    bst.root.left.left = new BNode6(1);
	    bst.root.left.right = new BNode6(3);

	    // Checking if the tree is a binary search tree
	    if (bst.isBST()) {
	        System.out.println("The binary tree is a binary search tree.");
	    } else {
	        System.out.println("The binary tree is not a binary search tree.");
	    }
	}

}
