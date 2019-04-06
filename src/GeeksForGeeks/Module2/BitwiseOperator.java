package GeeksForGeeks.Module2;

import GeeksForGeeks.FastReader;

public class BitwiseOperator {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while(t-- > 0){
            long a = fs.nextLong();
            long b = fs.nextLong();
            long c = fs.nextLong();

            long d = a^a;
            System.out.println(d);
            long e = c^b;
            System.out.println(e);
            long f = a&b;
            System.out.println(f);
            long g = c | (a ^ a);
            System.out.println(g);
            e = ~e;
            System.out.println(e);
        }
    }
}
