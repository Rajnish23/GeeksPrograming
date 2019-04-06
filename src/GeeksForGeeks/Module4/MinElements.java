package GeeksForGeeks.Module4;

import GeeksForGeeks.FastReader;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MinElements {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            PriorityQueue<Integer> arr=new PriorityQueue<>();

            for(int i=0;i<n;i++)
            {
                arr.add(sc.nextInt());
            }

            GeeksMin obj=new GeeksMin();
            obj.minElements(arr);
            System.out.println();
        }
    }
}

class GeeksMin
{
    static void minElements(PriorityQueue<Integer>arr)
    {
        //Your code here
        Comparator<Integer> customcomparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        PriorityQueue queue = new PriorityQueue(customcomparator);

        queue.addAll(arr);
        Iterator<Integer> itr3 = queue.iterator();

        while (itr3.hasNext()) {
            System.out.println(queue.poll());

        }



    }
}
