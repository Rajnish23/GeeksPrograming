package GeeksForGeeks.Module3;

import GeeksForGeeks.FastReader;

import java.math.BigInteger;

public class SumOfBigIntegers {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while(t-- > 0){
            BigInteger integer1 = BigInteger.valueOf(fs.nextLong());
            BigInteger integer2 = BigInteger.valueOf(fs.nextLong());
            System.out.println(integer1.mod(integer2));
        }
    }
}
