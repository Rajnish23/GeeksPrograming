package GeeksForGeeks.Module3;


import GeeksForGeeks.FastReader;

import java.util.Arrays;

class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        return this.length*this.breadth;
    }
}

public class MaximumAreaRectangle {
    public static void main(String[] args) {

        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while(t-- > 0){
            int N = fs.nextInt();
            Rectangle arr[] = new Rectangle[N];
            int area[] = new int[N];
            for(int i=0;i<N;i++){
                int length = fs.nextInt();
                int breadth = fs.nextInt();
                arr[i] = new Rectangle(length,breadth);
//                area[i] = arr[i].area();
            }
//            Arrays.sort(area);
            System.out.println(maxArea(arr));
        }
    }

    private static int maxArea(Rectangle[] arr) {
        int area[] = new int[arr.length];
        int count = 0;
        for (Rectangle data : arr){
            area[count++] = data.area();
        }
        Arrays.sort(area);
        return area[arr.length-1];
    }
}
