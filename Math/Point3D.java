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

    public Point3D subtract(Vector3D v){
        return new Point3D(x - v.x, y - v.y, z - v.z);
    }

    public Vector3D subtract(Point3D p) {
        return new Vector3D(x - p.x, y - p.y, z - p.z);
    }

    public Matrix toMatrix() {
        return new Matrix(new double[][]{{x}, {y}, {z}, {1}});
    }

    public static Point3D fromMatrix(Matrix matrix) {
        double[][] data = matrix.getData();
        return new Point3D(data[0][0], data[1][0], data[2][0]);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}