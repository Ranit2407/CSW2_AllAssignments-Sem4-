class BNode7 {
    int info;
    BNode7 left, right;

    public BNode7(int info) {
        this.info = info;
        left = null;
        right = null;
    }
}

class BST7 {
    BNode7 root;

    public BST7() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private BNode7 insertRec(BNode7 node, int value) {
        if (node == null) {
            node = new BNode7(value);
            return node;
        }

        if (value < node.info) {
            node.left = insertRec(node.left, value);
        } else if (value > node.info) {
            node.right = insertRec(node.right, value);
        }

        return node;
    }

    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private BNode7 deleteRec(BNode7 root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.info) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.info) {
            root.right = deleteRec(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.info = minValue(root.right);

            root.right = deleteRec(root.right, root.info);
        }

        return root;
    }

    private int minValue(BNode7 root) {
        int minv = root.info;
        while (root.left != null) {
            minv = root.left.info;
            root = root.left;
        }
        return minv;
    }

    public void inOrderTraversal() {
        inOrderTraversalRec(root);
        System.out.println();
    }

    private void inOrderTraversalRec(BNode7 node) {
        if (node != null) {
            inOrderTraversalRec(node.left);
            System.out.print(node.info + " ");
            inOrderTraversalRec(node.right);
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        BST7 bst = new BST7();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Original binary search tree (in-order traversal):");
        bst.inOrderTraversal();

        bst.delete(30);

        System.out.println("Binary search tree after deleting node with value 30 (in-order traversal):");
        bst.inOrderTraversal();
    }
}
