import java.util.*;
import java.io.*;

public class Ford {
    static int V;
    static long[][] capacity;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        
        st.nextToken();
        V = (int) st.nval;
        st.nextToken();
        int E = (int) st.nval;
        
        capacity = new long[V][V];
        
        for (int i = 0; i < E; i++) {
            st.nextToken();
            int u = (int) st.nval;
            st.nextToken();
            int v = (int) st.nval;
            st.nextToken();
            long cap = (long) st.nval;
            
            // Handle multiple edges between same pair by summing capacities
            capacity[u][v] += cap;
        }
        
        long maxFlow = edmondsKarp(0, V - 1);
        
        System.out.println(maxFlow);
    }
    
    static long edmondsKarp(int source, int sink) {
        long maxFlow = 0;
        int[] parent = new int[V];
        
        while (bfs(source, sink, parent)) {
            // Find minimum residual capacity along the path
            long pathFlow = Long.MAX_VALUE;
            int v = sink;
            
            while (v != source) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, capacity[u][v]);
                v = u;
            }
            
            // Update residual capacities along the path
            v = sink;
            while (v != source) {
                int u = parent[v];
                capacity[u][v] -= pathFlow;
                capacity[v][u] += pathFlow;
                v = u;
            }
            
            maxFlow += pathFlow;
        }
        
        return maxFlow;
    }
    
    static boolean bfs(int source, int sink, int[] parent) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(source);
        visited[source] = true;
        parent[source] = -1;
        
        while (!queue.isEmpty()) {
            int u = queue.poll();
            
            for (int v = 0; v < V; v++) {
                if (!visited[v] && capacity[u][v] > 0) {
                    queue.add(v);
                    visited[v] = true;
                    parent[v] = u;
                    
                    if (v == sink) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}
