public class isSorted06 {
    public static Boolean isSorted(int arr[], int i){
        //base condition
        if(i == arr.length-1){
            return true;
        }



        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,8,9,10,18};
        System.out.println(isSorted(arr, 0));    
    }
}
