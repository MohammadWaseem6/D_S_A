package STRINGS;

public class SubString {
    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(si);
        }
        return substr;

    }

    public static void main(String[] args) {
        String str = "helloworld";
        // System.out.println((substring(null, 1, 4)));
        System.out.println(str.substring(0, 5));
    }
}
