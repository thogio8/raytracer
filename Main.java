import javax.swing.*;
import RayTracer.*;
import Math.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point3D origin = new Point3D(0, 0, 0);
        Point3D screenOrigin = new Point3D(-1, -1, -1);
        Vector3D hor = new Vector3D(2, 0, 0);
        Vector3D ver = new Vector3D(0, 2, 0);
        Rectangle3D screen = new Rectangle3D(screenOrigin, hor, ver);

        Camera cam = new Camera(origin, screen);

        List<Hittable> objects = new ArrayList<>();
        objects.add(new Sphere(new Point3D(0, 0, -5), 1));
        objects.add(new Plane(new Point3D(0, -1, -5), new Vector3D(0, 1, 0)));

        int width = 900;
        int height = 900;

        JFrame frame = new JFrame("Ray Tracer");
        RayTracerPanel panel = new RayTracerPanel(cam, objects, width, height);
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}