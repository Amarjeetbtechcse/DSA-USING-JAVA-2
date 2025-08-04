public class lastOccurence08 {
    public static int lastOccurence(int arr[] ,int key, int i){
        //base case
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i ;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,20,43,20};
        int key = 20;
        System.out.println(lastOccurence(arr , key, 0));
    }
}

