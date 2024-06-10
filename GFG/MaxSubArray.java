public class MaxSubArray {
<<<<<<< HEAD
    public static void Printmaxsubarray(int[] array){
=======
    public static void Printmaxsubarray(int[] array) {
>>>>>>> main
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            currsum = currsum + array[i];
            if (currsum > maxsum) {
                maxsum = currsum;
<<<<<<< HEAD
=======

>>>>>>> main
            }
            if (currsum < 0) {
                currsum = 0;
            }
        }
        System.out.println(maxsum);
    }
<<<<<<< HEAD
    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 3, -4, 5, -1, -2, 4 };
=======

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
>>>>>>> main
        Printmaxsubarray(arr);
    }

}
