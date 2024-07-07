public class QuickSort {

    public static void quickSort(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,7,6,1};
        quickSort(arr);
    }
    
}
