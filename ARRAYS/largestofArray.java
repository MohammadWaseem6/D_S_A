public class largestofArray {
    public static int getlarg(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest is :" + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 20, 30, 40, 50, 56, 67 };
        System.out.println("largest is :" + getlarg(numbers));

    }
}
