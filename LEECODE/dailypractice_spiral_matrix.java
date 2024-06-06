package LEECODE;

public class dailypractice_spiral_matrix {
    public static void SprialMat(int matrix[][]) {
        int SR = 0;
        int SC = 0;
        int ER = matrix.length;
        int EC = matrix[0].length;
        while (SR <= ER && SC <= EC) {
            // TOP boundary
            for (int j = SR; j <= EC; j++) {
                System.out.print(matrix[SR][j] + "");

            }
            // right boundary
            for (int i = EC + 1; i <= ER; i++) {
                System.out.print(matrix[i][EC] + "");

            }
            for (int j = ER - 1; j <= EC; j--) {
                System.out.print(matrix[ER][j] + "");

            }
            for (int i = EC - 1; i <= ER; i--) {
                System.out.print(matrix[EC][i] + "");

            }
            SR++;
            EC++;
            SC--;
            EC--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        SprialMat(matrix);
    }

}
