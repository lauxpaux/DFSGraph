import java.util.Scanner;
import java.util.LinkedList;


public class DepthFirstSearch {
    static class Graph {
        int vertices;
        LinkedList<Integer> adjList[];
        boolean visited[];

        Graph(int vertices) {
            this.vertices = vertices;
            adjList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        void addEdge(int source, int destination) {
            adjList[source].addFirst(destination);
        }

        /*Here I need to add methods to: 
        start time: getStartVertex 
        end time: getEndVertex
        parent of each vertext: parentOfVertex
        edge classification: 
            getTreeEdgeIterator
            getBackEdgeIterator
            getForwardEdgeIterator
            getForwardEdgeIterator
            getCrossEdgeIterator 
        string with vertices on the path from the source of a given vertex along the edges: getPathFromSource
        method that returns the tree as LISP-style structure: dfsTreeToString
        method to get iterators over lists of tree edges, back edges, forward edges, and cross edges
        */
        void doDFS(int startVertex) {
            visited = new boolean[vertices];
            dfsRecursion(startVertex);



        }

        void dfsRecursion(int start) {
            visited[start] = true;
            System.out.print(start + " ");
            for (int i = 0; i < adjList[start].size(); i++) {
                int dest = adjList[start].get(i);
                if (!visited[dest])
                    dfsRecursion(dest);
            }
        }
    }


    //Main class 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int v = scan.nextInt();
        Graph g = new Graph(v);
        for (int i = 0; i < v; i++) {
            int source = scan.nextInt();
            int destination = scan.nextInt();
            g.addEdge(source, destination);
        }
        g.doDFS(0);
    }


    //Stack implemented with LinkedList main class
    public class GFG {
        public void main(String[] args) 
        {
            //create Object of Implementing class
            StackImplementation obj = new StackImplementation();
            //insert stack value
            obj.push(2);
            obj.push(4);
            obj.push(1);
            obj.push(3);
    
            //pring Stack elements
            obj.display();
            //print Top elemenent of stack
            System.out.printf("\nTop element is %d\n", obj.peek());
    
            //delete top element of Stack
            obj.pop();
            obj.pop();
    
            //print Stack elements 
            obj.display();
    
            //print Top element of Stack
            System.out.printf("\nTop element is %d\n", obj.peek());
        }
    }
}