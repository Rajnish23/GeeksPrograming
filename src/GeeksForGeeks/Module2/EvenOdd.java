package GeeksForGeeks.Module2;

import GeeksForGeeks.FastReader;

public class EvenOdd {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while(t-- > 0){
            int a = fs.nextInt();
            int b = fs.nextInt();
            printFirst(a%2==0?a:b);
            printNext(a%2==1?a:b);
        }
    }

    public static void printFirst(int a) {
        System.out.println(a);
    }
    public static void printNext(int b) {
        System.out.println(b);
    }
}
