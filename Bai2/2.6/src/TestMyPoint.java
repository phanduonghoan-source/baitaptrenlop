
public class TestMyPoint {
    public static void main(String[] args) {


        MyPoint p1 = new MyPoint();
        System.out.println("p1 = " + p1);


        System.out.println("Toa do p1: " + p1.toString());


        p1.setX(8);
        p1.setY(6);

        System.out.println("x = " + p1.getX());
        System.out.println("y = " + p1.getY());


        p1.setXY(3, 4);


        int[] xy = p1.getXY();
        System.out.println("x = " + xy[0]);
        System.out.println("y = " + xy[1]);

        System.out.println("p1 = " + p1);


        MyPoint p2 = new MyPoint(0, 4);
        System.out.println("p2 = " + p2);


        System.out.println("Khoang cach p1 den p2: "
                + p1.distance(p2));


        System.out.println("Khoang cach den (5, 6): "
                + p1.distance(5, 6));


        System.out.println("Khoang cach den (0, 0): "
                + p1.distance());
    }
}
