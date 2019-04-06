package GeeksForGeeks;

import java.util.StringTokenizer;

public class ReverseWordInGivenString {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0){
            String arr  = fs.nextLine();
            int index = 0;
            String value = "";
            String result= "";
            while(index < arr.length()){
                if(arr.charAt(index) == '.'){
                    value="."+value;
                    result = value+result;
                    value = "";
                }
                else{
                    value+=arr.charAt(index);
                }
                index++;
            }
            result = value+result;
            System.out.println(result);

        }
    }
}
