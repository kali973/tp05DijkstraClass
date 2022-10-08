package com.example.telecom.paris.interfaces;

import java.util.Set;

public interface MinDistance {

    void setMinDistance(Vertex vertex,
                        int distance);

    int getMinDistance(Vertex vertex);

    Vertex getMinDistanceVertex(ProcessedVertexesSet processedVertexes,
                                Set<Vertex> vertexes);
}
