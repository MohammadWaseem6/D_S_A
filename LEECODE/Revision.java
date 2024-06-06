package LEECODE;

public class Revision {
    public static int linser(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;

            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int key = 100;

        int index = linser(arr, key);

        if (index == -1) {
            System.out.println("Key Not Found");
        } else {
            System.out.print("Element Found at index  : " + linser(arr, key));
        }

    }
}
