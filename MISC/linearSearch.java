public class linearSearch {
    public static int linearSear(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = { 4, 5, 6, 7, 10, 22 };
        int key = 7;
        int index=linearSear(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            
            System.out.println("key index is:"  + index);
        }
    }
}
