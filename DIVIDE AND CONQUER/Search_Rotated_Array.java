public class Search_Rotated_Array {

    // Recursive function to search for the target in the rotated sorted array
    public static int Search(int arr[], int si, int ei, int target) {
        // Base case: If the start index exceeds the end index, target is not found
        if (si > ei) {
            return -1;
        }
        
        // Calculate the middle index
        int mid = si + (ei - si) / 2;

        // Check if the middle element is the target
        if (arr[mid] == target) {
            return mid;
        }

        // Check if the left half is sorted
        if (arr[si] <= arr[mid]) {
            // Check if the target is in the left half
            if (arr[si] <= target && target <= arr[mid]) {
                return Search(arr, si, mid - 1, target); // Search in the left half
            } else {
                return Search(arr, mid + 1, ei, target); // Search in the right half
            }
        } else { // Right half is sorted
            // Check if the target is in the right half
            if (arr[mid] <= target && target <= arr[ei]) {
                return Search(arr, mid + 1, ei, target); // Search in the right half
            } else {
                return Search(arr, si, mid - 1, target); // Search in the left half
            }
        }
    }

    public static void main(String[] args) {
        // Define the rotated sorted array
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        // Define the target element to search for
        int target = 0;

        // Call the search function and store the result
        int targetIndex = Search(arr, 0, arr.length - 1, target);

        // Print the index of the target element
        System.out.println(targetIndex);
    }
}
