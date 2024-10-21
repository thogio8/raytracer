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
}