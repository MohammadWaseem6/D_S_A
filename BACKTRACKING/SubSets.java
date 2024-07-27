
public class SubSets {

    /**
     * Recursively prints all subsets of the given string.
     * 
     * @param str   the input string for which subsets need to be generated
     * @param ans   the current subset being built
     * @param index the current index in the input string being processed
     */
    public static void printSubsets(String str, String ans, int index) {
        
        // base case: if index has reached the length of the string
        if (index == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null"); // prints "Null" for the empty subset
            } else {
                System.out.println(ans); // prints the current subset
            }
            return;
        }

        // yes case: include the current character in the subset
        printSubsets(str, ans + str.charAt(index), index + 1);

        // no case: do not include the current character in the subset
        printSubsets(str, ans, index + 1);
    }

  
    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0); // prints all subsets of string str
    }
}
