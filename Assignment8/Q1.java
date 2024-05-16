class BSTNode{
	int info;
	BSTNode left,right;
	public BSTNode(int info) {
		this.info=info;
		left=null;
		right=null;
	}
	
	public void insert(int value) {
		if(value<info) {
			if(left==null) {
				left=new BSTNode(value);
			}
			else {
				left.insert(value);
			}
		}
		else {
			if(right==null) {
				right=new BSTNode(value);
			}
			else {
				right.insert(value);
			}
		}
	}
	public void preOrderTraversal(BSTNode node) {
		if(node!=null) {
			System.out.print(node.info+" ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	public void inOrderTraversal(BSTNode node) {
		if(node!=null) {
			inOrderTraversal(node.left);
			System.out.print(node.info+" ");
			inOrderTraversal(node.right);
		}
	}
	public void postOrderTraversal(BSTNode node) {
		if(node!=null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.print(node.info+" ");
		}
	}
}
public class Q1{
	public static void main(String[] args) {
		BSTNode root=new BSTNode(50);
		root.insert(40);
		root.insert(30);
		root.insert(20);
		root.insert(70);
		root.insert(60);
		root.insert(80);
		System.out.println("Pre Order Traversal");
		root.preOrderTraversal(root);
		System.out.println();
		System.out.println("In Order Traversal");
		root.inOrderTraversal(root);
		System.out.println();
		System.out.println("Post Order Traversal");
		root.postOrderTraversal(root);
	}
}
