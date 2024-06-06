public class prime_UsingFunc {

  public static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
  public static int primeRange(int n) {
    for(int i =2;i<=n;i++){
      return primeRange();
  
    }  
  }

  public static void main(String[] args) {
    System.out.println();
    primeRange(20);
  }
}
