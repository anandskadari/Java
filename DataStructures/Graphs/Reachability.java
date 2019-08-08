import java.util.ArrayList;
import java.util.Scanner;

public class Reachability {
    static boolean visited[];
    static ArrayList<Integer>[] node;

    private static int reach(ArrayList<Integer>[] adj, int x, int y) {

        visited = new boolean[adj.length];
        node = adj;

        if(explore(adj[x],x,y))
        {
            return 1;
        }

        return 0;
    }

    private static boolean explore(ArrayList<Integer> adj,int x, int y)
    {
        if(visited[x]){
            return false; //already visited.
        }
        if(x==y){
            return true; //found the element. so path exists.
        }


        //If not found then continue for all other nodes.
        for(int i=0; i<adj.size() ; i++)
        {
            visited[x]=true;
            if(explore(node[adj.get(i)],adj.get(i),y))
            {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            adj[x - 1].add(y - 1);
            adj[y - 1].add(x - 1);
        }
        int x = scanner.nextInt() - 1;
        int y = scanner.nextInt() - 1;
        System.out.println(reach(adj, x, y));
    }
}


