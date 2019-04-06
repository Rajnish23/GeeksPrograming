package GeeksForGeeks.Module4;

import GeeksForGeeks.FastReader;

public class PatternPrinter {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();

        while(t-- > 0){
            String str = fs.next();
            String result = "";

            int low = 0, high = str.length()-1;

            while(low < high){
                result+=str.charAt(low);
                result+=str.charAt(high);
                low++;
                high--;
            }

            if(low == high){
                result+=str.charAt(low);
            }
            System.out.println(result);

        }
    }
}
