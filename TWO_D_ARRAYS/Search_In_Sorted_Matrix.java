package TWO_D_ARRAYS;

public class Search_In_Sorted_Matrix {
    public static boolean staircasesearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key Found at index :(" +  row + ",", + col + ")");
                return true;
            }
             else if (key < matrix[row][col]) {
                col--;
            } 
             else {
                row++;
                   }         

        }
        System.out.println("Key Not Found !");
            return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 },
                           { 71, 72, 73, 74 }, { 75, 76, 77, 78 } };
        int key = 78;
        staircasesearch(matrix, key);

    }
}
