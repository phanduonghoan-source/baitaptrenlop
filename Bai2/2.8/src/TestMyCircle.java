import java.util.Arrays;

/** Chương trình kiểm thử tất cả phương thức public của MyCircle. */
public class TestMyCircle {
    public static void main(String[] args) {

        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        MyCircle c2 = new MyCircle(1, 2, 3);
        System.out.println(c2);

        MyCircle c3 = new MyCircle(new MyPoint(4, 6), 5);
        System.out.println(c3);


        c1.setRadius(10);
        System.out.println("radius: " + c1.getRadius());          // 10


        c1.setCenter(new MyPoint(7, 8));
        System.out.println("center: " + c1.getCenter());


        c1.setCenterX(3);
        c1.setCenterY(4);
        System.out.println("centerX=" + c1.getCenterX() + ", centerY=" + c1.getCenterY());

        c1.setCenterXY(0, 0);
        System.out.println("centerXY=" + Arrays.toString(c1.getCenterXY()));
        System.out.println(c1);

        MyCircle c4 = new MyCircle(0, 0, 2);
        System.out.printf("area: %.2f%n", c4.getArea());
        System.out.printf("circumference: %.2f%n", c4.getCircumference());

        MyCircle c5 = new MyCircle(3, 4, 1);
        System.out.println("distance c4-c5: " + c4.distance(c5));
    }
}