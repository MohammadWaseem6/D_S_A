public class PairsInArray {
    public static void printPairs(int arr[]) {
        int totalpairs =0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("("+current+","+arr[j]+")");
                totalpairs ++;
            }
            System.out.println("total pairs = "+ totalpairs);
        }
        

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10};
        printPairs(arr);
    }

}
