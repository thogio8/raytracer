import RayTracer.*;
import Math.*;

public class Main {
    public static void main(String[] args) {
        Point3D origin = new Point3D(0, 0, 0);
        Point3D screenOrigin = new Point3D(-1, -1, -1);
        Vector3D hor = new Vector3D(2, 0, 0);
        Vector3D ver = new Vector3D(0, 2, 0);
        Rectangle3D screen = new Rectangle3D(screenOrigin, hor, ver);

        Camera cam = new Camera(origin, screen);

        Sphere sphere = new Sphere(new Point3D(0, 0, -3), 1);

        int width = 10;
        int height = 10;
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                double u = (double) i / (width - 1);
                double v = (double) j / (height - 1);
                Ray ray = cam.getRay(u, v);
                double t = sphere.hit(ray);
                if (t > 0.0) {
                    System.out.println("Hit at t = " + t + " for ray (" + u + ", " + v + ")");
                } else {
                    System.out.println("No hit for ray (" + u + ", " + v + ")");
                }
            }
        }
    }
}