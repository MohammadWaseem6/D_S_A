import java.util.*;

public class functions {
  public static int sum(int a, int b) {
    int sum = a + b;
    System.out.println("sum is :" + sum);
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Num 1:");
    int a = sc.nextInt();
    System.out.println("Enter Num 2");
    int b = sc.nextInt();
    sum(a, b);
    sc.close();
  }
}
