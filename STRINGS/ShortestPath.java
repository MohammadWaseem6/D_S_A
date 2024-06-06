package STRINGS;

public class ShortestPath {
    public static float findShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            int dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } 
            else if (dir == 'N') {
                y++;
            } 
            else if (dir == 'W') {
                x--;
            }
             else
                x++;
        }
      int  X2=x*x;
      int  Y2=y*y;
      return (float)Math.sqrt(X2+Y2);

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(findShortestPath(str));
    }

}
