package RayTracer;

import Math.*;

public class Camera{
    private Point3D origin;
    private Rectangle3D screen;

    public Camera(Point3D origin, Rectangle3D screen){
        this.origin = origin;
        this.screen = screen;
    }

    public Point3D getOrigin(){
        return origin;
    }

    public Rectangle3D getScreen(){
        return screen;
    }

    public Ray getRay(double u, double v){
        Point3D p = screen.pointAt(u, v);
        return new Ray(origin, p.subtract(origin));
    }

    public String toString(){
        return "Origin: " + origin + ", Screen: " + screen;
    }

    public Ray ray(double u, double v){
        Point3D p = screen.pointAt(u, v);
        return new Ray(origin, p.subtract(origin));
    }
}