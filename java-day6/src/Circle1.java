public class Circle1 implements GeometricObject{
    protected double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle1{" +
                "radius=" + radius +
                '}';
    }

    public double getPerimeter() {
        return  0.0;
    }

    public double getArea() {
        return  Math.PI * radius * radius;
    }
}
