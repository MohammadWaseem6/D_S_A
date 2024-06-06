public class StringLinearSearch {

    public static boolean mystr(String[] str, String key) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str[] = {"abc", "def", "ghi", "jkl"};
        String key = "ooo";
        
        boolean result = mystr(str, key);
        if (result) {
            System.out.println(key + " is found in the array.");
        } else {
            System.out.println(key + " is not found in the array.");
        }
    }
}
