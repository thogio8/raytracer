package Math;

import RayTracer.*;

public class Rectangle3D {
    private Point3D origin;
    private Vector3D hor, ver;

    public Rectangle3D(Point3D origin, Vector3D hor, Vector3D ver) {
        this.origin = origin;
        this.hor = hor;
        this.ver = ver;
    }

    public Point3D getOrigin() {
        return origin;
    }

    public Vector3D getHor() {
        return this.hor;
    }

    public Vector3D getVer() {
        return this.ver;
    }

    public String toString() {
        return "Origin: " + this.origin + ", Horizontal: " + this.hor + ", Vertical: " + this.ver;
    }

    public Point3D pointAt(double u, double v) {
        if (u < 0 || u > 1 || v < 0 || v > 1) {
            throw new IllegalArgumentException("Coordinates u and v must be between 0 and 1.");
        }
        return this.origin.add(this.hor.multiply(u)).add(this.ver.multiply(v));
    }
}