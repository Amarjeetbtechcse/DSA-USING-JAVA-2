public class searchInSortedMatrix {
    public static boolean staircaseSearch(int matrix[][], int key){
         int row = 0, col=matrix[0].length-1;

         while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("key is found at ("+row+"," +col +")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
         }
         System.out.println("sorry! This key not present in this matrix");
         return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};

        int key1 = 100;
        int key2 = 33;
        int key3 = 50;

        staircaseSearch(matrix, key1);
        staircaseSearch(matrix, key2);
        staircaseSearch(matrix, key3);

    }
}
