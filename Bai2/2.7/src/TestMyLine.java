import java.util.Arrays;


    public static void main(String[] args) {

        MyLine l1 = new MyLine(0, 0, 3, 4);
        System.out.println(l1);


        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(5, 6);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println(l2);


        System.out.println("begin: " + l2.getBegin());
        System.out.println("end: " + l2.getEnd());


        l2.setBegin(new MyPoint(10, 20));
        l2.setEnd(new MyPoint(30, 40));
        System.out.println(l2);


        l2.setBeginX(11);
        l2.setBeginY(21);
        l2.setEndX(31);
        l2.setEndY(41);
        System.out.println("beginX=" + l2.getBeginX() + ", beginY=" + l2.getBeginY());
        System.out.println("endX=" + l2.getEndX() + ", endY=" + l2.getEndY());


        l2.setBeginXY(1, 1);
        l2.setEndXY(4, 5);
        System.out.println("beginXY=" + Arrays.toString(l2.getBeginXY()));
        System.out.println("endXY=" + Arrays.toString(l2.getEndXY()));

        System.out.println("length of l1: " + l1.getLength());
        System.out.println("length of l2: " + l2.getLength());


        MyLine l3 = new MyLine(0, 0, 1, 1);
        System.out.println("gradient of l3 (rad): " + l3.getGradient());
        System.out.println("gradient of l3 (deg): " + Math.toDegrees(l3.getGradient()));
    }
