import javax.swing.*;
import java.awt.*;
import RayTracer.*;
import Math.*;
import java.util.List;

public class RayTracerPanel extends JPanel {
    private Camera cam;
    private List<Hittable> objects;
    private int width;
    private int height;

    public RayTracerPanel(Camera cam, List<Hittable> objects, int width, int height) {
        this.cam = cam;
        this.objects = objects;
        this.width = width;
        this.height = height;
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                double u = (double) i / (width - 1);
                double v = (double) j / (height - 1);
                Ray ray = cam.getRay(u, v);
                Vector3D color = new Vector3D(0, 0, 1);

                for (Hittable object : objects) {
                    double t = object.hit(ray);
                    if (t > 0.0) {
                        color = new Vector3D(1, 0, 0);
                        break;
                    }
                }

                g.setColor(new Color((float) color.getX(), (float) color.getY(), (float) color.getZ()));
                g.drawLine(i, j, i, j);
            }
        }
    }
}