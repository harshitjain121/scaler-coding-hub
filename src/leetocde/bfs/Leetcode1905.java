package leetocde.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode1905 {
    public static void main(String[] args) {
        int[][] grid1 = new int[][]{{1,0,1,0,1},{1,1,1,1,1},{0,0,0,0,0},{1,1,1,1,1},{1,0,1,0,1}};
        int[][] grid2 = new int[][]{{0,0,0,0,0},{1,1,1,1,1},{0,1,0,1,0},{0,1,0,1,0},{1,0,0,0,1}};
        System.out.println(countSubIslands(grid1, grid2));

    }

    public static int countSubIslands(int[][] grid1, int[][] grid2) {
        int count = 0;
        for(int i=0; i<grid2.length; i++){
            for(int j=0; j<grid2[0].length; j++){
                if(grid2[i][j] == 1){
                    System.out.println("enter");
                    grid2[i][j] = 0;
                    count += bfs(grid1, grid2, i, j);
                }
            }
        }
        return count;
    }
    
    public static int bfs(int[][] grid1, int[][] grid2, int r, int c){
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[]{r, c});
        
        //direction array
        int[][] dir = new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}};
        int count = 1;
        
        while(q.isEmpty()){
            int[] cur = q.poll();
            
            for(int i=0; i<4; i++){
                int curX = cur[0] + dir[i][0];
                int curY = cur[1] + dir[i][1];
                
                //validation
                if(curX <grid2.length && curX >=0 && curY <grid2[0].length && curY >=0 &&
                    grid2[curX][curY] == 1){
                    if(grid1[curX][curY] == 0){
                        count = 0;
                    }
                    grid2[curX][curY] = 0;
                    q.offer(new int[]{curX, curY});
                }
            }
        }
        return count;
    }
}
