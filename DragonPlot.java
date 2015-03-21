

public class DragonPlot {
    public static void main(String[] args) {
        String s = StdIn.readString();
        double step = 0.1, angle = 0.0;
        double x = 0.0, y = 0.0;
        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10);
        StdDraw.show(0);
        // DO NOT EDIT ABOVE THIS LINE.


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'F') {
                // TBD: remember current x and y; update x and y to
                // old value plus step * cos(angle) and old value plus
                // step * sin(angle) respectively; and draw line
                // from old (x, y) to new (x, y).
                double old_x=x;
                double old_y=y;
                x = old_x + step * Math.cos(angle);
                y = old_y + step * Math.sin(angle);
                StdDraw.line(old_x. old_y, x, y);
;
            }
            else if (c == 'L') {
                // TBD: rotate counter-clockwise by 90 degrees
                StdDraw.picture(x, y, "dragon.jpg", 90);
            }
            else {
                // TBD: rotate clockwise by 90 degrees
                StdDraw.picture(x, y, "dragon.jpg", -90);
            }
        }

        // DO NOT EDIT BELOW THIS LINE.
        StdDraw.show(0);
        StdDraw.save("dragon.jpg");
        System.exit(0);
    }
}
