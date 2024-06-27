import java.util.*;

public class Strings {

    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        String myname= "waseem";
        String lastname="ahamd";
        String fullname= myname + lastname;
        printletters(fullname.toUpperCase());


        
    }
       

}
