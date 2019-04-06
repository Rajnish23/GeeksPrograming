package GeeksForGeeks.Module4;

import GeeksForGeeks.FastReader;

import java.util.ArrayList;

public class GeekTheBuilder {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            ArrayList<Integer>arr=new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                arr.add(sc.nextInt());
            }

            Geekss obj=new Geekss();
            obj.builder(arr);
            System.out.println();
        }
    }
}

//User function Template for Java
class Geekss
{
    static void builder(ArrayList<Integer> arr)
    {
        int top = arr.get(0);

        for (int val =1;val<arr.size(); val++){
            if(arr.get(val) > top){
                arr.remove(val);
                arr.add(val,top);
            }
            else if(arr.get(val) < top) {
                top = arr.get(val);
            }

        }
        System.out.println(arr);
        //Your code here
    }
}