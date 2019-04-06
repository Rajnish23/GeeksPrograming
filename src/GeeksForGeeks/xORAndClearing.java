package GeeksForGeeks;

import java.util.Arrays;

public class xORAndClearing {
    public static void main(String[] args) {
        /*FastReader fs = new FastReader();
        int t = fs.nextInt();
        while(t-- > 0){
            int n = fs.nextInt();
            int arr[] = new int[n];
            for (int i=0; i<n ;i++){
                arr[i] = fs.nextInt();
                arr[i]^=i;
            }
            printArray(arr);
            Arrays.fill(arr,0);
            printArray(arr);
        }
    }

    private static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }*/
        int x = 5, y = 10;
        while(y != 0)
        {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print(x);
    }
}
