package RayTracer;

import Math.Ray;

public interface Hittable {
    double hit(Ray ray);
}