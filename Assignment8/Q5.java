class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class q5 {
    TreeNode root;

    public TreeNode createTree(int[] arr) {
        return createTreeRec(arr, 0, arr.length - 1);
    }

    private TreeNode createTreeRec(int[] arr, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = createTreeRec(arr, start, mid - 1);
        node.right = createTreeRec(arr, mid + 1, end);

        return node;
    }

    public void inOrderTraversal(TreeNode node) {
        if (node == null)
            return;

        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
       q5 tree = new q5();
        tree.root = tree.createTree(arr);

        System.out.println("Inorder Traversal of Constructed BST:");
        tree.inOrderTraversal(tree.root);
    }
}
