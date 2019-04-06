package GeeksForGeeks.Module5;

import GeeksForGeeks.FastReader;

import java.util.*;
import java.util.stream.IntStream;

public class GreaterAndSmallerOnes {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();

        // Iterating over testcases
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Geeks1 obj = new Geeks1();
            obj.greaterKSorted(arr, k);
            System.out.println();
            obj.smallerKSorted(arr, k);
            System.out.println();
            //System.out.println("~");
        }
    }
}

class Geeks1
{
    // Function to find elements greater than or equal to K
    public static void greaterKSorted(int arr[], int k)
    {
        // Your code here
        Arrays.sort(arr);
        arr = Arrays.stream(arr).distinct().toArray();
        int left = 0, right = arr.length,mid = -1;
        while(left < right){
            mid = left+(right - left)/2;
            if(arr[mid] == k){

                break;
            }
            else if(arr[mid] < k && arr[mid+1]>k){
                mid = mid+1;
                break;
            }
            else if(arr[mid] > k){
                right = mid;

            }
            else {
                left = mid+1;

            }


        }

        if(mid == arr.length-1){
            System.out.print("-1");
        }
        else{
            for (int i=mid;i<arr.length;i++){
                System.out.print(arr[i] +" ");
            }
        }


    }

    // Function to find element less than K
    public static void smallerKSorted(int arr[], int k)
    {
        int left = 0, right = arr.length,mid = -1;
        while(left < right){
            mid = left+(right - left)/2;
            if(arr[mid] == k){

                break;
            }
            else if(arr[mid] < k && arr[mid+1]>k){
                mid = mid+1;
                break;
            }
            else if(arr[mid] > k){
                right = mid;
            }
            else {
                left = mid+1;
            }


        }

        if(mid <=0){
            System.out.print("-1");
        }
        else{
            for (int i=0;i<mid;i++){
                System.out.print(arr[i] +" ");
            }
        }


    }
}