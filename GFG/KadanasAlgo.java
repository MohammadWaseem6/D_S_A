public class KadanasAlgo {

    
    public static void kadans(int numbers[]) {
        // Initialize the maximum sum (ms) to the smallest possible integer value
        int ms = Integer.MIN_VALUE;

        // Initialize the current sum (cs) to 0
        int cs = 0;

        // Loop through each number in the input array
        for (int i = 0; i < numbers.length; i++) {
            // Add the current number to the current sum
            cs = cs + numbers[i];

            // If the current sum becomes negative, reset it to 0
            if (cs < 0) {
                cs = 0;
            }

            // Update the maximum sum if the current sum is greater than the maximum sum
            ms = Math.max(cs, ms);
        }

        // Print the maximum subarray sum
        System.out.println("Our currsum is = " + cs);
        System.out.println("Our maximum sub array sum is = " + ms);
    }

    public static void main(String[] args) {
        // Example array of numbers
        int numbers[] = { 2, 3, 5, -6, -5, 4 };

        // Call the kadans function with the example array
        kadans(numbers);
    }
    

}
