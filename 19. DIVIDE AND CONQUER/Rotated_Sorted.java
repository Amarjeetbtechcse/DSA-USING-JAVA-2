public class Rotated_Sorted {

    // Method to search for a target element in a rotated sorted array
    public static int search(int arr[], int tar, int si, int ei) {
        // Base case: if the search interval is invalid (start index > end index)
        if (si > ei) {
            return -1; // Target element not found in the array
        }

        // Calculate the mid-point of the current search interval
        int mid = si + (ei - si) / 2;

        // Check if the middle element is the target
        if (arr[mid] == tar) {
            return mid; // Target found, return the index
        }

        // Check if the left half of the array is sorted
        if (arr[si] <= arr[mid]) {
            // Case A: If the target lies within the sorted left half
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid); // Recursively search in the left half
            } else {
                // Case B: If the target lies in the unsorted right half
                return search(arr, tar, mid + 1, ei); // Recursively search in the right half
            }
        }
        // If the left half is not sorted, then the right half must be sorted
        else {
            // Case C: If the target lies within the sorted right half
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei); // Recursively search in the right half
            } else {
                // Case D: If the target lies in the unsorted left half
                return search(arr, tar, si, mid - 1); // Recursively search in the left half
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2}; // Rotated sorted array
        int target = 0; // Target element to find
        int tarIdx = search(arr, target, 0, arr.length - 1); // Perform search
        System.out.println(tarIdx); // Output the index of target (expected: 4)
    }
}

