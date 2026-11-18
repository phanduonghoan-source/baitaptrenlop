public class TestMain {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        System.out.println(s1);
        Shape s2 = new Shape("blue", false);
        System.out.println(s2);


        Circle c1 = new Circle(5.5, "yellow", true);
        System.out.println(c1);
        System.out.printf("Circle Area: %.2f, Perimeter: %.2f%n", c1.getArea(), c1.getPerimeter());


        Rectangle r1 = new Rectangle(2.0, 4.0, "purple", false);
        System.out.println(r1);
        System.out.printf("Rectangle Area: %.2f, Perimeter: %.2f%n", r1.getArea(), r1.getPerimeter());


        Square sq1 = new Square(3.0, "orange", true);
        System.out.println(sq1);
        System.out.printf("Square Area: %.2f, Perimeter: %.2f%n", sq1.getArea(), sq1.getPerimeter());

        sq1.setWidth(5.0);
        System.out.println("After setWidth(5.0): " + sq1);
    }
}