package SORTINGS;

public class bublesort {
    public static void BBSort(int bs[]) {
        for (int i = 0; i < bs.length - 1; i++) {
            for (int j = 0; j < bs.length - 1 - i; j++) {
                if (bs[j] > bs[j + 1]) {
                    // swap
                    int temp = bs[j];
                    bs[j] = bs[j + 1];
                    bs[j + 1] = temp;
                }
            }
        }
    }

    public static void Printbs(int bs[]) {
        for (int i = 0; i < bs.length; i++) {
            System.out.print(bs[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int bs[] = { 5, 4, 3, 1, 2, 7, 8, 6 };
        BBSort(bs);
        Printbs(bs);
    }

}
