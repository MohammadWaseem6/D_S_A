package STRINGS;

public class Strcomp {

    public static void main(String[] args) {
        String s1 = "waseem";
        String s2 = "waseem";
        String s3 = new String("waseem");

        // if (s1 == s2) {
        //     System.out.println("strings are same");
        // } else {
        //     System.out.println("Strings are not same");
        // }
        // if (s1 == s3) {
        //     System.out.println("same strings");
        // } else {
        //     System.out.println("Not same");
        // }
        if(s1.equals(s3)){
            System.out.println("strings are same");
        }else {
            System.out.println("Strings are not same");

        }
    }
}
