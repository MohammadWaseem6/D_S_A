  import java.util.*;
public class LargestInArrays {
  

    public static int largest(int arr[]) {
        int larg = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (larg < arr[i]) {
                larg = arr[i];
            }
        }
        return larg;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 7, 3 };
        System.out.println("Largest number is: " + largest(arr));
    }
}

    
