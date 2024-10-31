public class clearLastIthBit {
    public static int clearIth(int n, int i ){
        int bitMask = (~0)<<i;
        return n& bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIth(15, 2));
    }
}
