import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TopologicalSorting topologicalSorting = new TopologicalSorting();
        ArrayList<Vertex> vertices = new ArrayList<>();

        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");

        c.addNeighbour(d);
        d.addNeighbour(b);
        e.addNeighbour(a);
        e.addNeighbour(b);
        f.addNeighbour(a);
        f.addNeighbour(c);

        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
        vertices.add(d);
        vertices.add(e);
        vertices.add(f);

        topologicalSorting.sort(vertices);

    }

}
