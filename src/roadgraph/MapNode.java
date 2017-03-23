package roadgraph;

import geography.GeographicPoint;

import java.util.ArrayList;
import java.util.List;

public class MapNode {

    private GeographicPoint location;
    private List<MapEdge> edges;

    public MapNode(GeographicPoint location) {
        this.location = location;
        edges = new ArrayList<>();
    }

    public void addEdge(MapEdge mapEdge) {
        edges.add(mapEdge);
    }

    public List<MapEdge> getEdges() {
        return edges;
    }

    public List<GeographicPoint> getNeighbors() {
        List<GeographicPoint> neighbors = new ArrayList<>();

        for (MapEdge edge : edges) {
            neighbors.add(edge.getEnd());
        }

        return neighbors;
    }
}
