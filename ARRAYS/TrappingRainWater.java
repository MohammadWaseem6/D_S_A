public class TrappingRainWater {

    // Method to calculate the amount of trapped rainwater
    public static int TrappedRainWater(int height[]) {
        int n = height.length;

        // Edge case: If the height array is empty or has less than 3 bars, no water can be trapped
        if (n <= 2) {
            return 0;
        }

        // Create an array to store the maximum height to the left of each bar
        int leftMax[] = new int[n];
        leftMax[0] = height[0]; // The first bar has no left neighbor, so it's the max itself

        // Fill leftMax array
        for (int i = 1; i < n; i++) {
            // For each bar, the max height to the left is either the height of the current bar or the max height to the left of the previous bar
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Create an array to store the maximum height to the right of each bar
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1]; // The last bar has no right neighbor, so it's the max itself

        // Fill rightMax array
        for (int i = n - 2; i >= 0; i--) {
            // For each bar, the max height to the right is either the height of the current bar or the max height to the right of the next bar
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Initialize a variable to store the total trapped water
        int trappedwater = 0;

        // Calculate the total trapped water
        for (int i = 0; i < n; i++) {
            // Water level at the current bar is the minimum of the max heights to the left and right
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // The trapped water at the current bar is the difference between this water level and the height of the bar itself
            trappedwater += waterlevel - height[i];
        }

        // Return the total amount of trapped water
        return trappedwater;
    }

    public static void main(String[] args) {
        // Example height array representing the elevation map
        int height[] = { 4, 2, 0, 6, 3, 2, 0, 5 };

        // Calculate and print the amount of trapped rainwater
        System.out.println(TrappedRainWater(height)); // Output should be 13
    }
}
