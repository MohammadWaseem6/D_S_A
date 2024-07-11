public class QuickSort {

       public static void printArray(int arr[]) {
        // Loop through the array and print each element
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print new line after printing the array
    }

    // Method to perform the QuickSort algorithm
    public static void quickSort(int arr[], int si, int ei) {
        // Base case: If starting index is less than ending index
        if (si < ei) {
            // Partition the array and get the pivot index
            int pIndex = partition(arr, si, ei);
            // Recursively sort the left subarray
            quickSort(arr, si, pIndex - 1);
            // Recursively sort the right subarray
            quickSort(arr, pIndex + 1, ei);
        }
    }

    // Method to partition the array
    public static int partition(int arr[], int si, int ei) {
        // Select the pivot element (last element of the array)
        int pivot = arr[ei];
        // Initialize the index of the smaller element
        int i = si - 1;

        // Loop through the array from si to ei-1
        for (int j = si; j < ei; j++) {
            // If the current element is less than the pivot
            if (arr[j] < pivot) {
                i++; // Increment the index of the smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++; // Increment i to point to the correct position for the pivot
        // Swap arr[i] and pivot (arr[ei])
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        // Return the index of the pivot
        return i;
    }

    // Main method to test the QuickSort algorithm
    public static void main(String[] args) {
        // Define an array to be sorted
        int arr[] = { 5, 3, 2, 7, 6, 1 };
        // Call the quickSort method with the array and initial indices
        quickSort(arr, 0, arr.length - 1);
        // Print the sorted array
        printArray(arr);
    }
}
