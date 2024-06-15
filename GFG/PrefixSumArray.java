import java.util.*;

public class PrefixSumArray {

    public static void printMaxSubarray(int[] array) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];

        // Calculate prefix sum array
        prefix[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }

        // Find the maximum subarray sum using the prefix sum array
        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int array[] = {1, -2, 6, -1, 3};
        printMaxSubarray(array);
    }
}
