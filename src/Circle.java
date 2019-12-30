public class Circle extends Point {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean isInside(Point point) {
        double distance = Math.sqrt(Math.pow(point.getX() - center.getX(), 2 + Math.pow(point.getX() - center.getY(), 2)));
        if (distance > radius) return false;
        else return true;
    }

    public String toString() {
        return "Circle with center (" + center.getX() + ", " + center.getY() + ") and radius " + radius;
    }

    public boolean isEqual(Circle circle) {
        if (radius == circle.radius && (center.getX() == circle.center.getX() && center.getY() == circle.center.getY())) return true;
        else return false;
    }
}
