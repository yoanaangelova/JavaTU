public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4,3);

        System.out.println("p1 is (" + p1.getX() + ", "+ p1.getY() + ")");
        System.out.println("p1's distance from origin = " + p1.distanceFromOrigin());

        System.out.println("p2 is (" + p2.getX() + ", "+ p2.getY() + ")");
        System.out.println("p2's distance from origin = " + p2.distanceFromOrigin());

        p1.translate(11, 6);
        System.out.println("p1 is (" + p1.getX() + ", "+ p1.getY() + ")");

        p2.translate(1, 7);
        System.out.println("p2 is (" + p2.getX() + ", "+ p2.getY() + ")");
    }
}
