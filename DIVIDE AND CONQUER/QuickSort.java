public class QuickSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si < ei) {
            int pIndex = partition(arr, si, ei);
            quickSort(arr, si, pIndex - 1);
            quickSort(arr, pIndex + 1, ei);
        }
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // Swap arr[i] and pivot (arr[ei])
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 7, 6, 1 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
