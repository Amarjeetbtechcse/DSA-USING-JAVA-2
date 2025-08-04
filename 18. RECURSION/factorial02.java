public class factorial02 {
    public static int fac(int n){
        if(n == 0){
            return 1;
        }
        int facOfNminusOne= fac(n-1);
        int result = n* fac(n-1);
        return result;
    }
    public static void main(String[] args) {
        int n =5; 
        System.out.println(fac(n));
    }
}
