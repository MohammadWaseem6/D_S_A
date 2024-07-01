public class BinaryEvenOdd {
    public static void EvnOdd(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        EvnOdd(3);
        EvnOdd(11);
    }
}
