package OOPS;

public class Classes {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.Setcolor("Blue");
        // System.out.println(p1.color);
        // Pen p2 = new Pen();
        // p2.Settip(8);
        // System.out.println(p2.tip);
        student s1 = new student();
        student s2 = new student(123);
        student s3 = new student();
        System.out.println(s2.name );
        System.out.println(s3.roll);

    }

}

class student {
    // String color;
    // int tip;
    // void Setcolor(String newcolor){
    // color=newcolor;
    // }
    // void Settip(int newtip){
    // tip=newtip;
    // }
    String name;
    int roll;

    student() {
        System.out.println("This constructor is called");
    }

    student(String name) {
        this.name = name;
    }

    student(int roll) {
        this.roll = roll;
    }

}