public class Arrays {

    public static void ChangeArray(int arr[], int value, int index) {
        if (index == arr.length) {
            printArray(arr);
            return;
        }
        arr[index] = value;
        ChangeArray(arr, value + 1, index + 1);
        arr[index] = arr[index] - 2;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        ChangeArray(arr, 1, 0);
        printArray(arr);
    }
}
