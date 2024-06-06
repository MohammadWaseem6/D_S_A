package ASSIGNMENTS;

public class sorting_assignments {
    public static void BBS(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bs(int bs[]) {
        for (int i = 0; i < bs.length; i++) {
            System.out.print(bs[i] + " ");
        }
    }

    public static void insertsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            if (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            arr[prev + 1] = curr;
        }
    }

    public static void is(int is[]) {
        for (int i = 0; i < is.length; i++) {
            System.out.print(is[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 2, 1, 4, 5, 7, 8 };
        // BBS(arr);
        // bs(arr);
        insertsort(arr);
        is(arr);

    }
}
