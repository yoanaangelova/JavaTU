public class LineSegmentMain {
    public static void main(String[] args) {
        Point start1 = new Point(7,2);
        Point end1 = new Point(3, 4);
        LineSegment line1 = new LineSegment(start1, end1);

        Point start2 = new Point(7,2);
        Point end2 = new Point(3, 4);
        LineSegment line2 = new LineSegment(start1, end1);

        Point point1 = new Point(3,4);

        System.out.println(line1.computeSlope());
        System.out.println(line1.computeB());
        System.out.println(line1.isInteracting(point1));
        System.out.println(line1.isEqual(line1, line2));
        System.out.println(line1.toString());
    }
}
