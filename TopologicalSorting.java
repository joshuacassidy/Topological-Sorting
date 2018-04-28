import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {

    private Stack<Vertex> stack;

    public TopologicalSorting() {
        this.stack = new Stack<>();
    }

    private void depthFirstSearch(Vertex vertex) {
        vertex.setVisited(true);

        for (Vertex v: vertex.getList()) {
            if (!v.isVisited()) {
                depthFirstSearch(v);
            }
        }
        stack.push(vertex);
    }

    public void sort(ArrayList<Vertex> vertices) {
        for (int i = 0; i < vertices.size(); i++) {
            if (!vertices.get(i).isVisited()) {
                depthFirstSearch(vertices.get(i));
            }
        }
        displayGraph();
    }

    private void displayGraph() {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().getData() + " ");
        }
    }



}
