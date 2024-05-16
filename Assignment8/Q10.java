import java.util.*;

// Node class to represent vertices in the graph
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Graph class
class Graph {
    int vertices;
    Node[] adjacencyList;

    // Constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new Node[vertices];
        for (int i = 0; i < vertices; ++i)
            adjacencyList[i] = null;
    }

    // Method to add an edge to the graph
    public void addEdge(int src, int dest) {
        Node newNode = new Node(dest);
        newNode.next = adjacencyList[src];
        adjacencyList[src] = newNode;

        // Uncomment the following lines for undirected graph
        // newNode = new Node(src);
        // newNode.next = adjacencyList[dest];
        // adjacencyList[dest] = newNode;
    }

    // Method to perform Breadth First Search
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            Node current = adjacencyList[vertex];
            while (current != null) {
                if (!visited[current.data]) {
                    visited[current.data] = true;
                    queue.offer(current.data);
                }
                current = current.next;
            }
        }
    }

    // Method to read a graph and store it in adjacency list representation
    public void readGraph(Scanner scanner, int edges) {
        System.out.println("Enter " + edges + " edges in format (source destination):");
        for (int i = 0; i < edges; ++i) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            addEdge(src, dest);
        }
    }
}

// Main class
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices in the graph:");
        int vertices = scanner.nextInt();

        System.out.println("Enter the number of edges in the graph:");
        int edges = scanner.nextInt();

        Graph graph = new Graph(vertices);
        graph.readGraph(scanner, edges);

        System.out.println("Breadth First Traversal of the graph:");
        graph.BFS(0); // Starting BFS from vertex 0
    }
}
