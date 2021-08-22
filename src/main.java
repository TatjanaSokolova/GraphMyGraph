import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Graph myGraph = createGraph();

        // 1. Print all the vertices
        for (Vertex myVertex : myGraph.getAdjVertices().keySet()) {
            System.out.println(myVertex.label);
        }
        System.out.println("From Purvciems:");
        for (Vertex directFlight :
                myGraph.getAdjVertices("Purvciems")) {
            System.out.println(directFlight.label);
        }
        //how many from Teika
        int counter = 0;
        for (Vertex directFlight :
                myGraph.getAdjVertices("Purvciems")) {
            counter ++;
        }  System.out.println(counter);
    }

    static Graph createGraph() {
        Graph graph = new Graph();
        graph.addVertex("Purvciems");
        graph.addVertex("Plavnieki");
        graph.addVertex("Teika");
        graph.addVertex("Ziepniekkalns");
        graph.addEdge("Purvciems", "Plavnieki");
        graph.addEdge("Purvciems", "Teika");
        graph.addEdge("Purvciems", "Ziepniekkalns");
        graph.addEdge("Plavnieki", "Teika");
        graph.addEdge("Teika", "Ziepniekkalns");
        return graph;
    }
}