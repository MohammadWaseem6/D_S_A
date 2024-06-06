public class Arrays {
    public static void marks(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 90, 96, 97 };
        marks(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }

}
