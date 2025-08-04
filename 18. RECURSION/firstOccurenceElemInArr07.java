public class firstOccurenceElemInArr07 {
    public static int firstOccurence(int arr[] ,int key, int i){
        //base case
        if(i == arr.length){
            return -1;
        }


        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,20,43,20};
        int key = 20;
        System.out.println(firstOccurence(arr , key, 0));
    }
}
