package GeeksForGeeks;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MakeThemOne {
    public static void main(String[] args) {
        FastReader fs = new FastReader();

        int t= fs.nextInt();
        while(t-- > 0 ) {

            int r = fs.nextInt(), c = fs.nextInt();
            int arr[][] = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                   arr[i][j] = fs.nextInt();
                }
            }

            HashMap<Integer, Integer> pair = new HashMap<>();
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (arr[i][j] == 1) {
                        pair.put(i, j);
                    }
                }
            }


            for (Map.Entry<Integer, Integer> set : pair.entrySet()) {
                int i1 = set.getKey();
                int j1 = set.getValue();
                for (int k = 0; k < c; k++) {
                    arr[i1][k] = 1;
                }

                for (int k = 0; k < r; k++) {
                    arr[k][j1] = 1;
                }
            }


            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}
