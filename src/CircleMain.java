public class CircleMain {
    public static void main(String[] args) {
        Point center = new Point(7, 2);
        int rad = 3;
        Point p1 = new Point(6,1);
        Point center2 = new Point(7, 2);
        int rad2 = 3;
        Circle circle = new Circle(center, rad);
        Circle circle2 = new Circle(center2, rad2);

        System.out.println(circle.isInside(p1));
        System.out.println(circle.isEqual(circle2));
        System.out.println(circle.toString());
    }
}
