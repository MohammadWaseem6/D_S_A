public class LinearSearch {
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14, 15, 16, 17, 18, };
        int key = 100;
        int index = search(num, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at:->  " + index);
        }

    }

}
