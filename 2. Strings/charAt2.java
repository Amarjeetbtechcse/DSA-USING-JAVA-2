public class charAt2 {
    public static void charPrint(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str = "This is my university";
        
        charPrint(str);
    }
}
