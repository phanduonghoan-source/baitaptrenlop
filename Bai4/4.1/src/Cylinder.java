
public class Cylinder extends Circle {
    private double height = 1.0;


    public Cylinder() {
        super();
        height = 1.0;
    }


    public Cylinder(double height) {
        super();          // goi Circle()
        this.height = height;
    }


    public Cylinder(double radius, double height) {
        super(radius);    // goi Circle(radius)
        this.height = height;
    }


    public Cylinder(double radius, double height, String color) {
        super(radius, color);   // goi Circle(radius, color)
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }


    public double getVolume() {
        return super.getArea() * height;
    }


    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }
}
