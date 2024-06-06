package SORTINGS;

public class Counting_Sort {
    public static void CountSort(int arr[]) {
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            Largest = Math.max(Largest, arr[i]);
        }
        int count[] = new int[Largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void Printcs(int cs[]) {
        for (int i = 0; i < cs.length; i++) {
            System.out.print(cs[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 4, 6, 2, 1, 3, 5, 6, 8, 7 };
        CountSort(arr);
        Printcs(arr);
    }

}
