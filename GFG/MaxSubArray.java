public class MaxSubArray {
    public static void Printmaxsubarray(int[] array) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            currsum = currsum + array[i];
            if (currsum > maxsum) {
                maxsum = currsum;

            }
            if (currsum < 0) {
                currsum = 0;
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6,-1, 3 };
        Printmaxsubarray(arr);
    }

}
