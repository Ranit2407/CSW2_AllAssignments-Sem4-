import java.util.*;

// Node class to represent vertices in the graph
class Node2 {
    int data;
    Node next;

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

// Graph class
class Graph2 {
    int vertices;
    Node[] adjacencyList;

    // Constructor
    public Graph2(int vertices) {
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

    // Method to perform Depth First Search
    public void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Node current = adjacencyList[vertex];
        while (current != null) {
            if (!visited[current.data]) {
                DFSUtil(current.data, visited);
            }
            current = current.next;
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
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices in the graph:");
        int vertices = scanner.nextInt();

        System.out.println("Enter the number of edges in the graph:");
        int edges = scanner.nextInt();

        Graph2 graph = new Graph2(vertices);
        graph.readGraph(scanner, edges);

        System.out.println("Depth First Traversal of the graph:");
        graph.DFS(0); // Starting DFS from vertex 0
    }
}
