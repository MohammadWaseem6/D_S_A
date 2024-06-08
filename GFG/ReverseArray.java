public class ReverseArray {

    public static void revArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        
        // Swap the elements until the start index is less than the end index
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move the indices towards the center
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        revArray(arr);
        
        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
