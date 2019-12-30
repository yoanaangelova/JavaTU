public class LineSegment extends Point{
    private Point start;
    private Point end;

    public LineSegment(Point A, Point B) {
        start = A;
        end = B;
    }

    public double computeSlope() {
        return (end.getY() - start.getY()) - (end.getX() - start.getX());
    }

    public double computeB() {
        double slope = computeSlope();
        return start.getY() - slope * start.getX();
    }

    public boolean isInteracting(Point point) {
        double slope = computeSlope();
        double b = computeB();
        if (point.getY() == slope * point.getX() + b) return true;
        else return false;
    }

    public String toString() {
        return "Point with equation y = " + computeSlope() +" * x + " + computeB();
    }

    public boolean isEqual(LineSegment line1, LineSegment line2) {
        if(line1.computeB() == line2.computeB() && line1.computeSlope() == line2.computeSlope()) return true;
        else return false;
    }
}
