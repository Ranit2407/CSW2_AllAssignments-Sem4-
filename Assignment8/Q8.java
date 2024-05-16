import java.util.ArrayList;

class Graph {
    private int V;
    private boolean[][] adjMatrix;
    private ArrayList<ArrayList<Integer>> adjList;

    public Graph(int v) {
        V = v;
        adjMatrix = new boolean[V][V];
        adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = true;
        adjMatrix[v][u] = true;
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void displayAdjMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    public void displayAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int j : adjList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        int V = 5;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.displayAdjMatrix();
        System.out.println();
        graph.displayAdjList();
    }
}

