package RayTracer;

import Math.Point3D;
import Math.Vector3D;

public class Plane implements Hittable {
    private Point3D point;
    private Vector3D normal;

    public Plane(Point3D point, Vector3D normal) {
        this.point = point;
        this.normal = normal.normalize();
    }

    @Override
    public double hit(Ray ray) {
        double denominator = normal.dot(ray.getDirection());
        if (Math.abs(denominator) > 1e-6) {
            Vector3D p0l0 = point.subtract(ray.getOrigin());
            double t = p0l0.dot(normal) / denominator;
            return (t >= 0) ? t : -1.0;
        }
        return -1.0;
    }
}