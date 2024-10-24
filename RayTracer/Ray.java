package RayTracer;

import Math.Point3D;
import Math.Vector3D;
import Math.Matrix;

public class Ray{
    private Point3D origin;
    private Vector3D direction;

    public Ray(Point3D origin, Vector3D direction){
        this.origin = origin;
        this.direction = direction;
    }

    public Point3D getOrigin(){
        return origin;
    }

    public Vector3D getDirection(){
        return direction;
    }

    public Point3D getPoint(double t){
        return origin.add(direction.multiply(t));
    }

    public String toString(){
        return "Origin: " + origin + ", Direction: " + direction;
    }
}