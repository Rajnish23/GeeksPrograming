package GeeksForGeeks;


import GeeksForGeeks.Module3.Pair;

import java.math.BigInteger;
import java.util.Comparator;


class Emp_order implements Comparator<String>
{
    public int compare(String Emp1, String Emp2)
    {
        return Emp1.compareTo(Emp2);
    }
}
class GFG
{
    static boolean checkPrime(long n)
    {
        BigInteger b = new BigInteger(String.valueOf(n));
        return b.isProbablePrime(1);
    }
    public static void main (String[] args)
    {
        int n = 19, n2 = 23;
        BigInteger val = BigInteger.valueOf(n);
        BigInteger val2 = BigInteger.valueOf(n2);
        System.out.print(val.compareTo(val2));
    }

}