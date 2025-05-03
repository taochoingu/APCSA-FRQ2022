import java.util.*;

public class Data {
    public static final int max = 696969;
    private int[][] grid;

    public Data(int n, int m) {
        grid = new int[n][m];
    }

    public void repopulate() {
        int random;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                do {
                    random = ((int) (Math.random() * (max / 10)) + 1) * 10;
                } while (random % 100 == 0 || random > max);
                grid[i][j] = random;
            } 
        } 
    }

    public int countIncreasingCols() {
        boolean check = true;
        int count = 0;
        for (int i = 0; i < grid[0].length; i++) {
            check = true;
            for (int j = 0; j < grid.length - 1; j++) {
                if (grid[j][i] > grid[j + 1][i]) {
                    check = false;
                    break;
                }
            }
            if (check) count++;
        }
        return count;
    }

    /*public void get() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]);
                System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Data a = new Data(2,4 );
        a.repopulate();
        a.get();
        System.out.println(a.countIncreasingCols());
    }*/
}
