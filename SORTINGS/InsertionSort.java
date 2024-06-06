package SORTINGS;

public class InsertionSort {
    public static void InSort(int arr[]) {
        for (int i = 1; i < arr.length; i++ ){
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void PrintIS(int is[]) {
        for (int i = 0; i < is.length; i++) {
            System.out.print(is[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 2, 3,1 };
        InSort(arr);
        PrintIS(arr);
    }

}
