package GeeksForGeeks.Module5;

import GeeksForGeeks.FastReader;

import java.util.Arrays;

public class PairSumExistense {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = 0;
            n = sc.nextInt();
            int arr[] =  new int[n];  //array of size n

            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt(); //Input the array

            int sum = 0;
            sum = sc.nextInt();

            SumGeeks obj = new SumGeeks();
            System.out.println(obj.sumExists(arr, n, sum));
        }
    }
}
class SumGeeks
{
    public static int sumExists(int arr[], int n, int sum)
    {
        // add your code here
        Arrays.sort(arr);
        int low = 0,high = n-1;
        while(low<high){
            int currSum = arr[low] + arr[high];
            if(currSum == sum){
                return 1;
            }
            if(currSum > sum){
                high--;
            }
            else{
                low++;
            }
        }
        return 0;
    }
}
