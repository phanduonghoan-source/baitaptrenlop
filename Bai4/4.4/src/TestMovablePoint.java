import java.util.Arrays;

public class TestMovablePoint {
    public static void main(String[] args) {

        MovablePoint p1 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        MovablePoint p2 = new MovablePoint(0.5f, 1.5f);
        MovablePoint p3 = new MovablePoint();
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

        p1.move();
        System.out.println("p1 sau 1 lan move = " + p1);

        p1.move().move();
        System.out.println("p1 sau them 2 lan move = " + p1);

        p1.setSpeed(2.0f, 3.0f);
        System.out.println("Toc do moi = " + Arrays.toString(p1.getSpeed()));
        p1.move();
        System.out.println("p1 sau khi doi toc do va move = " + p1);


        p1.setXY(10.0f, 20.0f);
        System.out.println("x = " + p1.getX() + ", y = " + p1.getY());
        System.out.println("Toa do = " + Arrays.toString(p1.getXY()));
    }
}