

public class DragonPlot {
    public static void main(String[] args) {
        String s = StdIn.readString();
        double step = 0.1, angle = 0.0;
        double x = 0.0, y = 0.0;
	double temp;
        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10);
        StdDraw.show(0);
        // DO NOT EDIT ABOVE THIS LINE.

        StdDraw.point(0.0, 0.0);
        for (int i = 0; i < s.length(); i++) {
            int l = 1;
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
                //StdDraw.line(old_x, old_y, x, y);
                StdDraw.line(old_x, old_y, x, y);
                //if (i!=0 && i % 2 == 0) {
                //StdDraw.show(0);
                StdDraw.save("dragon.jpg");
		//}               
            }
            else if (c == 'L') {
                // TBD: rotate counter-clockwise by 90 degrees
                //StdDraw.save("dragon.jpg");
                //StdDraw.picture(0, 0, "dragon.jpg", 90);
                angle = angle + Math.PI/2;
                //l++;
		//temp = x;
		//x = y;
                //y = -temp; 
                //StdDraw.show(0);
                //StdDraw.save("dragon.jpg");
                //StdDraw.save("dragon.jpg");
            }
            else {
                // TBD: rotate clockwise by 90 degrees
                //StdDraw.picture(0, 0, "dragon.jpg", 90);
		angle = angle - Math.PI/2;
                //temp = x;
		//x = -y;
                //y = temp; 
                //StdDraw.save("dragon.jpg");
            }
        }

        // DO NOT EDIT BELOW THIS LINE.
        StdDraw.show(0);
        StdDraw.save("dragon.jpg");
        System.exit(0);
    }
}
