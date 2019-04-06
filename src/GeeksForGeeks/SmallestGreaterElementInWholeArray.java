package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallestGreaterElementInWholeArray {
    public static void main(String[] args) {
        FastReader fs = new FastReader();

        int t = fs.nextInt();
        while(t-- > 0){
            int n = fs.nextInt();
            long arr [] = new long[n];
            ArrayList<Long> list = new ArrayList<>();
            for (int i=0; i<n; i++){
                arr[i] = fs.nextLong();
                list.add(arr[i]);
            }
            Collections.sort(list);
            for (int i=0; i<n; i++){
                int index = list.indexOf(arr[i]);
                if(index == list.size()-1){
                    System.out.print("_ ");
                }
                else {
                    while(arr[i] == list.get(index+1)){
                        index++;
                    }
                    System.out.print(list.get(index+1)+" ");

                }
            }
            System.out.println( );
        }
    }
}
