package array;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        int marks[] = new int[50];
        //System.out.println("array length : " + marks.length);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phys : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        double percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // marks[2]= marks[2] + 3;//update array
        // System.out.println(" updated marks math : " + marks[2]);
        System.out.println("percentage is : " + percentage);
    }

}
