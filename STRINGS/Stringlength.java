package STRINGS;

public class Stringlength {
    public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String Fname = "waseem";
        String Lname = "Ahmad";
        String total = Fname + Lname;
        System.out.println("length is " + total.length() + "name is :" + " " + " " + Fname + " " + Lname);
       // System.out.println(total.charAt(5));
        printletters(total);
    }
}
