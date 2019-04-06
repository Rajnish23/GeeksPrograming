package GeeksForGeeks.Module4;

import GeeksForGeeks.FastReader;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueOperation {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int testcase = sc.nextInt();

        while(testcase-- > 0){
/*
            // Priority Queue with comparator
            PriorityQueue<Integer> p_queue = new PriorityQueue<Integer>(new Comparator<Integer>() {

                public int compare(Integer w1, Integer w2) {
                    return w2.compareTo(w1);
                }
            });

            int n = sc.nextInt();

            // Invoking object of Geeks class
            Geeks obj = new Geeks();

            for(int i = 0;i<n;i++){
                int k = sc.nextInt();
                obj.insert(p_queue, k);
            }

            int x = sc.nextInt();
            for(int i = 0;i<x;i++){
                int k = sc.nextInt();
                boolean f = obj.find(p_queue, k);
                if(f != false){
                    System.out.println("1");
                    System.out.println(obj.delete(p_queue));
                }
                else{
                    System.out.println("-1");
                }
            }*/
        }
    }
}
/*

class Geeks{

    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k){


        q.add(k);
        // Your code here
        //Just insert k in q
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k){

       return q.contains(k);
        // Your code here
        // If k is in q return true else return false

    }

    // Function to delete the element from queue
    static int delete(PriorityQueue<Integer> q){
        // Your code here
        //Delete the max element from q. The priority queue property might be useful here
        int max = q.peek();
        q.poll();
        return max;
    }

}*/
