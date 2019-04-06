package GeeksForGeeks.Module2;

import GeeksForGeeks.FastReader;

import java.util.Arrays;
import java.util.Collections;

public class AlmostEqual {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while(t-- > 0){
           int SIZE_OF_CHAR = 26;
           int array[] = new int[26];
           Arrays.fill(array,0);
            String str1 = fs.next();
            String str2 = fs.next();
            char ar1[] = str1.toCharArray();
            char ar2[] = str2.toCharArray();
            int length = ar1.length-1;
            while(length!=-1){
                array[ar1[length]-'a']++;

                length--;
            }
            length = ar2.length-1;
            while(length!=-1){
                array[ar2[length]-'a']--;
                length--;
            }

            int count =0;
            for(int i=0;i<26;i++){
                count+=Math.abs(array[i]);
            }
            System.out.println(count);
        }


    }



}
