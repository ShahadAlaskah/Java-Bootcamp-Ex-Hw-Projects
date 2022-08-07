

public class Circle2 extends Shape{
    protected double radius=0;

    public Circle2() {
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle1{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return  0.0;
    }

    public double getArea() {
        return  Math.PI * radius * radius;
    }
}
