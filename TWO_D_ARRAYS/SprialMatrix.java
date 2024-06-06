package TWO_D_ARRAYS;

public class SprialMatrix {
    public static void SparialMatrix(int matrix[][]) {
        int startRow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;
        while (startRow <= endrow && startcol <= endcol) {
            //TOP BOUNDARY
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            //RIGHT BOUNDARY
            for (int i = startRow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            //BOTTOM BOUNDARY
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startRow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            //LEFT BOUNDARY
            for (int i = endrow - 1; i >= startRow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");

            }

            startcol++;
            startRow++;
            endcol--;
            endrow--;
        }
        System.out.println();
     }

      public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        SparialMatrix(matrix);
    }
}
