package GeeksForGeeks;

public class PatternMatcher {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while(t-- > 0){
            String pattern = fs.next();
            int index = 0;
            int count = 0;
            int  end = pattern.length();
            while(index < end){
                while(index<end &&pattern.charAt(index) == 'x'){
                    count++;
                    index++;
                }
                while(index<end && pattern.charAt(index) == 'y'){
                    count--;
                    index++;
                }
                if(count<0){
                    break;
                }

            }
            if(count==0){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
