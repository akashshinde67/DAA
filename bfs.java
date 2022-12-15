import java.util.*;
import java.io.*;

class Graph{
    int v;
    linkedlist<Integer> adj[];
    
    graph(int v){
        V = v;
        adj = new linkedlist[v];
        for (int i=0;i<v;i++){
            adj[i]=new linkedlist();
        }
    }
    
    void addedge(int v,int w){
        adj[v].add(w);
    }
    
    void bfs(int s){
        boolen visited[] = new boolean[V];
        
        linkedlist<Integer> queue = new linkedlist<Integer>();
        
        visited[s] = true;
        queue.add(s);
        
        while (queue.size() != 0){
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if (!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String args[]){
        Graph g = new Graph(4);
        g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		g.bfs(2);
    }
}