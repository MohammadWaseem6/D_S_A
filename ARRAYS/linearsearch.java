public class linearsearch {
    public static int linearS(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 20, 30, 40, 60 };
        int key = 20;
        int index = linearS(numbers, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at:" + index);
        }

    }

}
