package Math;

import Math.Vector3D;

public class Point3D{
    private double x, y, z;
    public Point3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(){
        this(0, 0, 0);
    }

    public double distance(Point3D p){
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2) + Math.pow(z - p.z, 2));
    }

    public String toString(){
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public Point3D add(Vector3D v){
        return new Point3D(x + v.x, y + v.y, z + v.z);
    }

    public Matrix toMatrix() {
        return new Matrix(new double[][]{{x}, {y}, {z}, {1}});
    }

    public static Point3D fromMatrix(Matrix matrix) {
        double[][] data = matrix.getData();
        return new Point3D(data[0][0], data[1][0], data[2][0]);
    }

    //Main method for testing all the methods
    public static void main(String[] args){
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(4, 5, 6);
        Vector3D v = new Vector3D(1, 1, 1);
        System.out.println(p1.distance(p2));
        System.out.println(p1.add(v));
        System.out.println(p1.toMatrix());
        System.out.println(Point3D.fromMatrix(p1.toMatrix()));
    }
}