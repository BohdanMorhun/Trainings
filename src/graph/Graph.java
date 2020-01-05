package graph;

import java.util.*;

public class Graph<T> {

    private Map<T, List<T>> map = new HashMap<>();

    private void addVertex(T s) {
        map.put(s, new ArrayList<>());
    }

    private void addEdge(T source, T destination) {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        map.get(destination).add(source);
    }

    private void printVertexCount() {
        System.out.println("The graph has "
                + map.keySet().size()
                + " vertices");
    }

    private boolean hasVertex(T s) {
        return map.containsKey(s);
    }

    private boolean hasEdge(T s, T d) {
        return map.getOrDefault(s, Collections.emptyList()).contains(d);
    }

    private boolean hasConnection(T src, T dest) {

        Queue<T> q = new ArrayDeque<>();
        q.add(src);

        Map<T, Boolean> discovered = new HashMap<>();
        discovered.put(src, true);

        while (!q.isEmpty()) {
            T v = q.poll();
            if (v.equals(dest)) {
                return true;
            }
            for (T u : map.get(v)) {
                if (!discovered.getOrDefault(u, false)) {
                    discovered.put(u, true);
                    q.add(u);
                }
            }
        }
        return false;
    }

    private boolean isConnected() {

        final T firstVertex = map.keySet().iterator().next();

        Queue<T> q = new ArrayDeque<>();
        q.add(firstVertex);

        Map<T, Boolean> discovered = new HashMap<>();
        discovered.put(firstVertex, true);

        while (!q.isEmpty()) {
            T v = q.poll();
            for (T u : map.get(v)) {
                if (!discovered.getOrDefault(u, false)) {
                    discovered.put(u, true);
                    q.add(u);
                }
            }
        }

        return discovered.keySet().size() == map.keySet().size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }
        return (builder.toString());
    }

    public static void main(String[] args) {

        Graph<Integer> graph = new Graph<>();

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(5, 6);
//        graph.addEdge(3, 6);

        System.out.println("Graph:\n" + graph.toString());

        checkEdge(graph, 0, 2);
        checkEdge(graph, 3, 2);
        checkEdge(graph, 6, 5);

        System.out.println("The graph contains vertex -> " + graph.hasVertex(3));

//        if (graph.hasConnection(graph, src, dest, discovered)) {
//            System.out.println("Path exists from vertex " + src + " to vertex " + dest);
//        } else {
//            System.out.println("No path exists between vertices " + src + " and " + dest);
//        }

        checkConnection(graph, 0, 3);
        System.out.println("Is graph connected: " + graph.isConnected());

        graph.printVertexCount();
    }

    private static void checkEdge(Graph<Integer> g, int s, int d) {
        System.out.println(String.format("The graph has edge between (%d) and (%d) -> %s", s, d, g.hasEdge(s, d)));
    }

    private static void checkConnection(Graph<Integer> g, int s, int d) {
        System.out.println(String.format("The graph has connection between (%d) and (%d) -> %s", s, d, g.hasConnection(s, d)));
    }
}





