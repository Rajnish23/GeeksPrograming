package GeeksForGeeks.Module5;

import GeeksForGeeks.FastReader;

import java.util.HashMap;
import java.util.Map;

public class SameFrequency {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t=sc.nextInt();

        while(t-->0)
        {
            int n1,n2;
            n1=sc.nextInt();
            n2=sc.nextInt();
            int arr1[]=new int[n1];
            for(int i=0;i<n1;i++)
            {
                int x=sc.nextInt();
                arr1[i]=x;

            }
            int arr2[]=new int[n2];
            for(int i=0;i<n2;i++)
            {
                int x=sc.nextInt();
                arr2[i]=x;
            }

            GeeksFrequency obj=new GeeksFrequency();
            obj.sameFreq(arr1,arr2);
            System.out.println();
        }
    }
}

class GeeksFrequency
{
    static void sameFreq(int arr1[],int arr2[])
    {
        //Java
        HashMap<Integer,Integer> values = new HashMap<>();
        for(int i=0; i<arr1.length; i++){
            if(values.containsKey(arr1[i])){
                values.put(arr1[i],values.get(arr1[i])+1);
            }
            else{
                values.put(arr1[i],1);
            }
        }
        for(int i=0; i<arr2.length; i++){
            if(values.containsKey(arr2[i])){
                values.put(arr2[i],values.get(arr2[i])-1);
            }
        }

        boolean flag = false;
        for (Map.Entry<Integer, Integer> curr: values.entrySet()){
            if(curr.getValue() == 0){
                flag = true;
                System.out.print(curr.getKey()+" ");
            }
        }

        if(!flag){
            System.out.print("-1");
        }
    }
}
