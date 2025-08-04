public class fibonacci05 {
    public static int fib(int n){
        if(n == 1 || n==0){
            return n;
        }
        // int fibNminusOne = fib(n-1);
        // int fibNminusTwo = fib(n-2);
        // int fibN = fib(n-1) + fib(n-2);
        // return fibN;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }
}
