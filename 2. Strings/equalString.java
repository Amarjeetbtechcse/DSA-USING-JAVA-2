
// import javax.sound.sampled.SourceDataLine;

public class equalString{
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("String are equal ");
        }else{
            System.out.println("String are not equal");
        }

        if(s2 == s3){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
    }
}//interning concept 
//check at object level == sign 