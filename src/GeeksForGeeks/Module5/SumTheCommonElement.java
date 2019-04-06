package GeeksForGeeks.Module5;

import GeeksForGeeks.FastReader;

import java.util.*;

public class SumTheCommonElement {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int arr1[] = new int[n1];
            int arr2[] = new int[n2];
            for(int i = 0; i < n1; i++)
                arr1[i] = sc.nextInt();

            for(int i = 0; i < n2; i++)
                arr2[i] = sc.nextInt();



            Geeks obj = new Geeks();
            System.out.println(obj.commonSum(arr1, arr2));
        }
    }
}

class Geeks
{
    public static long commonSum(int arr1[], int arr2[])
    {
        //Your code here
        long sum =0;

        HashSet<Integer> hashSet1 = new HashSet<Integer>();
        HashSet<Integer> hashSet2 = new HashSet<Integer>();
        for (int i=0;i<arr1.length;i++){
            hashSet1.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){
            hashSet2.add(arr2[i]);
        }
        Set<Integer> intersect = intersection(hashSet1,hashSet2);
        for (Integer ele : intersect){
            sum+=ele;
        }
        return sum;
    }

    private static Set<Integer> intersection(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2) {
        if(hashSet1.size() > hashSet2.size()){
            return intersection(hashSet2,hashSet1);
        }

        Set<Integer> result = new HashSet<>();
        for (Integer elements : hashSet1){
            if(hashSet2.contains(elements)){
                result.add(elements);
            }
        }
        return  result;
    }
}
