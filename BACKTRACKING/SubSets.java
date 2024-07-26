public class SubSets {

    public static void printSubsets(String str, String ans, int index) {

        // basecase
        if (index == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }

            return;
        }
        // yes Case

        printSubsets(str, ans + str.charAt(index), index + 1);

        // no case
        printSubsets(str, ans, index + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0); // prints all subsets of string str
    }
}
