package array;

public class MaxSubArrays {
    public static void maxsubarraySum(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }

        }
        System.out.println("maximum sum : " + maxsum);

    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxsubarraySum(numbers);
    }

}
