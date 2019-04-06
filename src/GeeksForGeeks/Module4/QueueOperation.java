package GeeksForGeeks.Module4;

import GeeksForGeeks.FastReader;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class QueueOperation {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int testcase = sc.nextInt();

      /*  while(testcase-- > 0){
            // Declaring Queue
            Queue<Integer> q = new LinkedList<>();
            int n = sc.nextInt();

            // Invoking object of Geeks class
            Geeks obj = new Geeks();

            for(int i = 0;i<n;i++){
                int k = sc.nextInt();
                obj.insert(q, k);
            }

            int x = sc.nextInt();
            for(int i = 0;i<x;i++){
                int k = sc.nextInt();
                int f = obj.findFrequency(q, k);
                if(f != 0){
                    System.out.println(f);
                }
                else{
                    System.out.println("-1");
                }
            }
        }*/
    }
}

/*
class Geeks{

    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k){

        // Your code here
        q.add(k);

    }

    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        int count = 0;
        for (Integer value : q) {
            if(value == k){
                count++;
            }
        }
        // Your code here
        return count;
    }

}*/
