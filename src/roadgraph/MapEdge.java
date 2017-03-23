package roadgraph;

import geography.GeographicPoint;

public class MapEdge {

    private GeographicPoint start;
    private GeographicPoint end;
    private String roadName;
    private String roadType;
    private Double length;

    public MapEdge(GeographicPoint from, GeographicPoint to, String roadName,
                   String roadType, double length) {
        this.start = from;
        this.end = to;
        this.roadName = roadName;
        this.roadType = roadType;
        this.length = length;
    }

    public GeographicPoint getStart() {
        return start;
    }

    public GeographicPoint getEnd() {
        return end;
    }

    public String getRoadName() {
        return roadName;
    }

    public String getRoadType() {
        return roadType;
    }

    public Double getLength() {
        return length;
    }
}
