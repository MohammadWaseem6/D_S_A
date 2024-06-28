import java.util.*;

public class ShortestPath {
    public static float getShortestPath(String path) {
        float x = 0;
        float y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // south direction
            if (direction == 'S') {
                y--;
            // north direction
            } else if (direction == 'N') {
                y++;
            // west direction
            } else if (direction == 'W') {
                x--;
            // east direction
            } else if (direction == 'E') {
                x++;
            }
        }
        float xsqr = x * x;
        float ysqr = y * y;
        return (float) Math.sqrt(xsqr + ysqr);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
