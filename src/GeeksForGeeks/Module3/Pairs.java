package GeeksForGeeks.Module3;

import GeeksForGeeks.FastReader;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Pairs {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while(t-- > 0){
            int n = fs.nextInt();
            Pair []pairs = new Pair[n];
            for(int i=0;i<n;i++){
                int x = fs.nextInt();
                int y = fs.nextInt();
                pairs[i] = new Pair(x,y);
            }

            Arrays.sort(pairs, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.x - o2.y;
                }
            });


            for(Pair data: pairs){
                System.out.println(data.x + " "+ data.y);
            }
        }
    }
}
