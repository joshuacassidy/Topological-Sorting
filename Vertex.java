import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String data;
    private boolean visited;
    private List<Vertex> list;

    public Vertex(String data) {
        this.data = data;
        list = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        list.add(vertex);
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setList(List<Vertex> list) {
        this.list = list;
    }

    public String getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getList() {
        return list;
    }
}
