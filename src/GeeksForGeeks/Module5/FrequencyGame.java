package GeeksForGeeks.Module5;

import GeeksForGeeks.FastReader;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyGame {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();

        // Iterating over testcases
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GeeksFreq obj = new GeeksFreq();
            System.out.println(obj.LargButMinFreq(arr, n));
        }
    }

}

class GeeksFreq
{
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n)
    {
        // Your code here
        Map<Integer,Integer> value = new TreeMap<>();
        for (int i=0;i<n;i++){
            if(value.containsKey(arr[i])){
                value.put(arr[i],value.get(arr[i])+1);
            }
            else {
                value.put(arr[i], 1);
            }
        }

        return 0;

    }
}