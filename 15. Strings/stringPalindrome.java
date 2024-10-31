public class stringPalindrome {
    public static void  isPalindrome(String str){
        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                //not a palindrome
                System.out.println("not a palindrome number");
                // return false;
            }
        }
        // return true;
        System.out.println("this is palindrome number ");
    }
    public static void main(String[] args) {
        String str = "racecar";
        isPalindrome(str);
    }
}
