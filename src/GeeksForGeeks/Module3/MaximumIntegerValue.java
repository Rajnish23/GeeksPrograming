package GeeksForGeeks.Module3;

import GeeksForGeeks.FastReader;

public class MaximumIntegerValue {
    public static void main(String[] args) {

        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0){
            String str = fs.next();
            int res = str.charAt(0) -'0';

            // Start traversing the string
            for (int i = 1; i < str.length(); i++)
            {
                // Check if any of the two numbers
                // is 0 or 1, If yes then add current
                // element
                int curr = str.charAt(i)- '0';
                if ( curr+ res > curr *res )
                    res += (str.charAt(i)-'0');

                    // Else multiply
                else
                    res *= (str.charAt(i)-'0');
            }
            System.out.println(res);
        }
    }
}
