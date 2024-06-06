package array;

import java.util.Scanner;

public class dp_array {
    // public static void main(String[] args) {
        //  int marks[] = new int[100];
        // // Scanner sc = new Scanner(System.in);
        // // marks[0] = sc.nextInt();
        // // marks[1] = sc.nextInt();
        // // marks[2] = sc.nextInt();
        // // int percentage=( marks[0]+marks[1]+marks[2])/3;
        // // System.out.println("percentage  "+ percentage + " %");
        // System.out.println("array length is = " + marks.length );
        public static void update(int marks[]){
            for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
            public static void main(String[] args) {
                int marks[]={97,98,99};
                update(marks);
                for(int i=0;i<marks.length;i++){
                    System.out.println(marks[i]);
                }
                System.out.println();

            }
        }
   
