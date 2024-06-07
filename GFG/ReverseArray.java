public class ReverseArray {

    public static int revArray(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr []= {5,4,3,2,1};
        revArray(arr);
    }

}
