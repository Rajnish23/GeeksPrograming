package GeeksForGeeks.Module4;

import GeeksForGeeks.FastReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListOperation {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(3);
        arr.add(4);

        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        arr1.add(5);
        arr1.add(6);
        arr1.addAll(1, arr);

        System.out.print(arr1);

      /*  FastReader sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            // Declaring ArrayList
            ArrayList <Integer> list = new ArrayList<Integer>();
            int q = sc.nextInt();

            // Working through queries
            while(q-- > 0)
            {
                char ch = sc.next().charAt(0);
                Geeks obj = new Geeks();
                if(ch == 'a')
                {
                    int x = sc.nextInt();
                    obj.insert(list, x);
                }

                if(ch == 'i')
                {
                    obj.IncOrder(list);
                }

                if(ch == 's')
                {
                    int ele = sc.nextInt();
                    obj.Search(list, ele);
                }
                if(ch == 'd')
                {
                    obj.DecOrder(list);
                }


            }
        }*/
    }
}

class Geeks
{
    /*// Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        clist.add(c);
        //add c to clist
    }

    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
        int count = 0;
        if(clist.contains(c)*//*Your code here*//*) {
            for (Character val : clist) {
                if (val == c) {

                    count++;
                }
            }
            System.out.println(count*//*Your code here*//*);
        }
        else
            System.out.println("Not Present");

    }*/

        // Function to insert element into list
        public static void insert(ArrayList<Integer> list, int x)
        {
            // Your code here
            list.add(x);

        }

        // Function to sort list in Increasing order
        public static void IncOrder(ArrayList<Integer> list)
        {
            // Your code here
            Collections.sort(list);

        }

        // Function to search element in the lise
        // val : element to be searched
        public static void Search(ArrayList<Integer> list, int val)
        {


            int flag = -1;
            if(list.contains(val)){
                flag = list.indexOf(val);
            }
            /*
            Your Code here
             * */
            if(flag == -1){
                System.out.println("-1");
            }
            else{
                System.out.println(flag);
            }


        }

        // Function to sort list in decreasing order
        public static void DecOrder(ArrayList<Integer> list)
        {
            // Your code here

            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });
        }
}
