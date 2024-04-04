package Inheritance;

public class TestPoint {
    public static void main(String[] args) {
        Point2D myPoint2d = new Point2D(1,2);
        Point3D myPoint3d = new Point3D(3,2,2);
        System.out.println(myPoint2d);
        System.out.println(myPoint3d);
        myPoint3d.setXYZ(2, 3, 1);
        System.out.println(myPoint3d);
        System.out.println(myPoint3d.getXYZ());
    }
}
