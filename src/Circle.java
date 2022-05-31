public class Circle {
    private double radius;
    private static final float PI = 3.14f;
    protected static int circlesMultiplesThree; // Количество кругов чья площадь кратна 3

    protected double findArea() {
        double Y = PI * Math.pow(radius, 2);
        return Y;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static float getPI() {
        return PI;
    }

    public static int getCirclesMultiplesThree() {
        return circlesMultiplesThree;
    }

    public static void setCirclesMultiplesThree(int circlesMultiplesThree) {
        Circle.circlesMultiplesThree = circlesMultiplesThree;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

