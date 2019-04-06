package GeeksForGeeks.Module4;

import GeeksForGeeks.FastReader;

import java.util.Queue;
import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();

        while(t-- > 0)
        {
            // Declaring stack of integers
            Stack<Integer> st = new Stack<Integer>();

            int q = fs.nextInt();

            // Working with queries
            while(q-- > 0)
            {
               /* char ch = fs.next().charAt(0);
                Geeks obj = new Geeks();
                if(ch == 'i')
                {
                    int x = fs.nextInt();
                    obj.insert(st, x);
                }

                if(ch == 'r')
                {
                    obj.remove(st);
                }

                if(ch == 'h')
                {
                    obj.headOf_Stack(st);
                }
                if(ch == 'f')
                {
                    int x = fs.nextInt();
                    obj.find(st, x);
                }*/


            }
            // System.out.println();
        }
    }
}
/*
class Geeks
{
    // Function to insert element to stack
    public static void insert(Stack<Integer> st, int x)
    {
        // Your code here
        st.push(x);

    }

    // Function to pop element from stack
    public static void remove(Stack<Integer> st)
    {
        int x = st.pop();// Your code here

    }

    // Function to return top of stack
    public static void headOf_Stack(Stack<Integer> st)
    {
        int x = st.peek();// Your code here
                System.out.println(x + " ");
    }

    // Function to find the element in stack
    public static void find(Stack<Integer> st, int val)
    {

        if(st.contains(val)*//*Your code here*//*){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}*/
