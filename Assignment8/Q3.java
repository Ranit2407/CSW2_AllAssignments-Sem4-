
import java.util.LinkedList;
import java.util.Queue;

class Country {
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
    
}

class BNode {
    Country info;
    BNode left, right;

    public BNode(Country info) {
        this.info = info;
        left = null;
        right = null;
    }
}

class BST {
    BNode root;

    public BST() {
        root = null;
    }

    public void insert(Country country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode node, Country country) {
        if (node == null) {
            node = new BNode(country);
            return node;
        }

        if (country.population < node.info.population) {
            node.left = insertRec(node.left, country);
        } else if (country.population > node.info.population) {
            node.right = insertRec(node.right, country);
        }

        return node;
    }

    public void levelOrderTraversal() {
        if (root == null) return;

        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BNode tempNode = queue.poll();
            System.out.print(tempNode.info.name + "(" + tempNode.info.population + ") ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public BNode findMax() {
        if (root == null) return null;
        BNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    public BNode findMin() {
        if (root == null) return null;
        BNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

	public void createTree(int[] arr) {
		// TODO Auto-generated method stub
		
	}
}

public class Q3 {
    public static void main(String[] args) {
    	
        BST bst = new BST();
        bst.insert(new Country("USA", 328_200));
        bst.insert(new Country("China", 1_398_000));
        bst.insert(new Country("India", 1_366_400));
        bst.insert(new Country("Brazil", 211_000));
        bst.insert(new Country("Pakistan", 220_000));

        System.out.println("Level order traversal:");
        bst.levelOrderTraversal();
        System.out.println();

        BNode maxNode = bst.findMax();
        System.out.println("Country with maximum population: " + maxNode.info.name + " (" + maxNode.info.population + ")");

        BNode minNode = bst.findMin();
        System.out.println("Country with minimum population: " + minNode.info.name + " (" + minNode.info.population + ")");
    }
}
