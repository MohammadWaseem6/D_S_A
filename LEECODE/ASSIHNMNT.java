package LEECODE;

public class ASSIHNMNT {

    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 9 },
                        { 8, 7, 9 } };
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    total++;
                }
            }
            
        }
        System.out.println("count of 7 is :" + total);

    }
    
}
