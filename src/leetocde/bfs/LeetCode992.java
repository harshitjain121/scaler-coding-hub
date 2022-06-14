package leetocde.bfs;

import java.util.ArrayList;
import java.util.List;

public class LeetCode992 {
    public static void main(String[] args) {
        int[][] land = new int[][]{{1,0,0}, {0,1,1}, {0,1,1}};
        findFarmland(land);

    }

    public static int[][] findFarmland(int[][] land) {
        List<int[]> resultList = new ArrayList<>();
        
        for(int i=0; i<land.length; i++){
            for(int j=0; j<land[0].length; j++){
                if(land[i][j] == 1){
                    // land[i][j] = 0;
                    resultList.add(farmland(land, i, j));
                }
            }
        }
        return resultList.toArray(new int[0][]);
    }
    
    public static int[] farmland(int[][] land, int i, int j){
        int row = i;
        int col = j;
        // my land is a rectangle
        while(row < 3 && land[row][j] == 1){
            col = j;
            while(col < 3 && land[row][col] == 1){
                System.out.println("ENTRY");
                land[row][col] = 0;
                col++;
            }
            row++;
        }
        row--;
        col--;
        System.out.println(i + " " + j + " " + row + " " + col);
        return new int[]{i, j, row-1, col-1};
        
    }
}
