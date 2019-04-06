package GeeksForGeeks;

public class ForLoopPrimeCheck {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while(t-- > 0){
            int n = fs.nextInt();
            if (n <= 1)
                System.out.println("No");
            else{
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        System.out.println("No");
                        break;
                    }
                }
                if(isPrime){
                    System.out.println("Yes");
                }

            }
        }
    }
}
