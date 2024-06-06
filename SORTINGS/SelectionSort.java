package SORTINGS;

public class SelectionSort {
    public static void SelSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int MinPos = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[MinPos] > arr[j]) {
                    MinPos = j;
                }
            }
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i] = temp;
            
        }
    }
    
    public static void Printbs(int bs[]) {
        for (int i = 0; i < bs.length; i++) {
            System.out.print(bs[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        SelSort(arr);
        Printbs(arr);

    }
}
