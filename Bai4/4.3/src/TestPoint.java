import java.util.Arrays;


public class TestPoint {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        System.out.println("p1 = " + p1);

        Point2D p2 = new Point2D(1.5f, 2.5f);
        System.out.println("p2 = " + p2);
        p2.setXY(3.0f, 4.0f);
        System.out.println("p2 sau setXY = " + p2);
        System.out.println("p2.getXY() = " + Arrays.toString(p2.getXY()));

        Point3D p3 = new Point3D();
        System.out.println("p3 = " + p3);

        Point3D p4 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("p4 = " + p4);
        p4.setXYZ(5.5f, 6.5f, 7.5f);
        System.out.println("p4 sau setXYZ = " + p4);
        System.out.println("p4.getXYZ() = " + Arrays.toString(p4.getXYZ()));
        System.out.println("p4.getXY()  = " + Arrays.toString(p4.getXY())); // ke thua tu Point2D
    }
}
