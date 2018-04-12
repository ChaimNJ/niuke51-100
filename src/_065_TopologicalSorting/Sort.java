package _065_TopologicalSorting;

import java.util.Stack;

public class Sort {
    public static void main(String[] args) {
        int[][] adjMatrix = {{0,0,1,0,0},{0,0,1,0,0},{0,0,0,1,1},{0,0,0,0,1},{0,0,0,0,0}};
        int[] re = getResult(adjMatrix,getInDegree(adjMatrix));
        for (int r = 0; r < re.length; r++) {
            System.out.print(re[r]+" ");
        }
        System.out.println();
        dfs(adjMatrix);
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }

    //减治法
    public static int[] getResult(int[][] graph,int[] indegree){
        int[] re = new int[indegree.length];
        int cnt = 0;
        while(true) {
            for (int i = 0; i < indegree.length; i++) {
                if (indegree[i] == 0) {
                    re[cnt++] = i;
                    indegree[i] = -1;
                    for (int j = 0; j < graph[i].length; j++) {
                        if (graph[i][j] == 1) {
                            indegree[j] -= 1;
                        }
                    }
                }
            }
            if (cnt == indegree.length) {
                break;
            }
        }
        return re;
    }
    public static int[] getInDegree(int[][] graph){
        int[] indegree = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if(graph[j][i]==1){
                    indegree[i]++;
                }
            }
        }
        return indegree;
    }


    //DFS
    public static void dfs(int[][] graph){
        int[] flag = new int[graph.length];

        for (int i = 0; i < flag.length; i++) {
            if(flag[i]==0){
                visit(graph,flag,i);
            }
        }
    }
    public static  Stack<Integer> stack = new Stack();
    private static void visit(int[][] graph,int[] flag,int i) {
        flag[i]=1;
        for (int j = 0; j < flag.length; j++) {
            if(graph[i][j]==1&&flag[j]==0){
                visit(graph,flag,j);
            }
        }
        stack.push(i);
    }
}
