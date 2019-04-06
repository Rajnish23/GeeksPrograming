package GeeksForGeeks.Module5;

import GeeksForGeeks.FastReader;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateElements {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GeeksDuplicate obj = new GeeksDuplicate();
            obj.SortedDuplicates(arr, n);
            System.out.println();  // print the newline

        }
    }
}

class GeeksDuplicate
{
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n)
    {
        //Your code here
        Map<Integer,Integer> map = new TreeMap<>();
        for (int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        boolean flag = true;
        for (Map.Entry<Integer,Integer> values : map.entrySet()){
            if(values.getValue() > 1){
                flag = false;
                System.out.print(values.getKey()+" ");
            }
        }
        if(flag){
            System.out.print("-1");
        }
    }

}