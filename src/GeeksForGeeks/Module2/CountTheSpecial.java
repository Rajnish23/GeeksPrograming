package GeeksForGeeks.Module2;

import GeeksForGeeks.FastReader;

import java.util.HashMap;
import java.util.Map;

public class CountTheSpecial {


    public static void main(String[] args) {
          int result = 0;
        FastReader fs = new FastReader();
        int n = fs.nextInt(),k = fs.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = fs.nextInt();
        }

        Map<Integer,Integer> data = new HashMap<>();
        for (int i=0; i<n; i++){
            if (data.containsKey(arr[i])){
                data.put(arr[i],data.get(arr[i])+1);
            }
            else {
                data.put(arr[i],1);
            }
        }
        int f = (int)Math.floor(n/k);
        for (Map.Entry<Integer,Integer> entry : data.entrySet()){
            if(entry.getValue() == f){
                result++;
            }
        }
        System.out.println(result);

    }
}
