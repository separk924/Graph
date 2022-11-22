import java.util.*;

public class Graph<V> implements GraphIfc<V> {

    Map<V, List<V>> theMap = new HashMap<V, List<V>>();

    /**
     * Returns the number of vertices in the graph
     * 
     * @return The number of vertices in the graph
     */
    public int numVertices() {
        return theMap.keySet().size();
    }

    /**
     * Returns the number of edges in the graph
     * 
     * @return The number of edges in the graph
     */
    public int numEdges() {
        int edges = 0;
        for (V v : theMap.keySet()) {
            edges += theMap.get(v).size();
        }
        return edges;
    }

    /**
     * Removes all vertices from the graph
     */
    public void clear() {
        theMap.clear();
    }

    /**
     * Adds a vertex to the graph. This method has no effect if the vertex already
     * exists in the graph.
     * 
     * @param v The vertex to be added
     */
    public void addVertex(V v) {
        theMap.putIfAbsent(v, new LinkedList<V>());
    }

    /**
     * Adds an edge between vertices u and v in the graph.
     *
     * @param u A vertex in the graph
     * @param v A vertex in the graph
     * @throws IllegalArgumentException if either vertex does not occur in the
     *                                  graph.
     */
    public void addEdge(V u, V v) {
        if (theMap.containsKey(v) && theMap.containsKey(u)) {
            theMap.get(u).add(v);
        } else {
            throw new IllegalArgumentException("One or both of the vertices do not occur in the graph.");
        }
    }

    /**
     * Returns the set of all vertices in the graph.
     * 
     * @return A set containing all vertices in the graph
     */
    public Collection<V> getVertices() {
        return null;
    }

    /**
     * Returns the neighbors of v in the graph. A neighbor is a vertex that is
     * connected to
     * v by an edge. If the graph is directed, this returns the vertices u for which
     * an
     * edge (v, u) exists.
     * 
     * @param v An existing node in the graph
     * @return All neighbors of v in the graph.
     * @throws IllegalArgumentException if the vertex does not occur in the graph
     */
    public Collection<V> getNeighbors(V v) {
        return null;
    }

    /**
     * Determines whether the given vertex is already contained in the graph. The
     * comparison
     * is based on the <code>equals()</code> method in the class V.
     * 
     * @param v The vertex to be tested.
     * @return True if v exists in the graph, false otherwise.
     */
    public boolean containsVertex(V v) {
        return false;
    }

    /**
     * Determines whether an edge exists between two vertices. In a directed graph,
     * this returns true only if the edge starts at v and ends at u.
     * 
     * @param v A node in the graph
     * @param u A node in the graph
     * @return True if an edge exists between the two vertices
     * @throws IllegalArgumentException if either vertex does not occur in the graph
     */
    public boolean edgeExists(V v, V u) {
        return false;
    }

    /**
     * Returns the degree of the vertex. In a directed graph, this returns the
     * outdegree of the
     * vertex.
     * 
     * @param v A vertex in the graph
     * @return The degree of the vertex
     * @throws IllegalArgumentException if the vertex does not occur in the graph
     */
    public int degree(V v) {
        return 0;
    }

    /**
     * Returns a string representation of the graph. The string representation shows
     * all
     * vertices and edges in the graph.
     * 
     * @return A string representation of the graph
     */
    public String toString() {
        return "";
    }
}