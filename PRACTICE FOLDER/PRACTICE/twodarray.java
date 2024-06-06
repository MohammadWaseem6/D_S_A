import java.util.Scanner;

public class twodarray {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0;matrix[0].length; < m; j++) {
                if (matrix[i][j] == key) {
                    return true;
                    System.out.println("Key found");

                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        search(matrix, 5);

    }
}
