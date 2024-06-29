public class SubStr {
    public static String getSubStr(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);

        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "waseemahmad";
        System.out.println(getSubStr(str, 3,5));
    }

}
