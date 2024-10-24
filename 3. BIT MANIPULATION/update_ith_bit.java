public class update_ith_bit {
    
    public static int setBit(int n , int i ){
        int bitMask = 1<<i;
        return (n | bitMask);
    }
    public static int clearBit(int n , int i ){
        int bitMask = ~(1<<i);
        return (n & bitMask);
    }

    public static int updateBit(int n , int i , int newBit){

        if(newBit == 0){
            return clearBit(n, i);
        }else{
            return setBit(n,i);
        }

        //// this can be done by this way logically and better way 

        // n = clearBit(n,i);
        // int bitMask = newBit<<i;
        // return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateBit(10, 2, 1));
    }
}
// answer is fourteen here