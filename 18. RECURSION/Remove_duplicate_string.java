public class Remove_duplicate_string{
        public static void removeDuplicateString(String str, int idx, StringBuilder newStr, boolean map[]){
            //base value
            if (idx == str.length()){
                System.out.println(newStr);
                return;
            }

            //kaam
            char currChar = str.charAt(idx);
            if(map[currChar-'a'] == true){
                //duplicate
                removeDuplicateString(str, idx+1, newStr, map);
            }else{
                map[currChar-'a'] = true;
                removeDuplicateString(str, idx+1, newStr.append(currChar), map);
            }
        }
        public static void main(String[] args) {
            String str="appnnacollegehowaareyoukaisehaoaaplog";//not valid for any space
            removeDuplicateString(str, 0, new StringBuilder(""), new boolean[26]);
        }
    }