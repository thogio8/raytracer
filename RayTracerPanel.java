import javax.swing.*;
import java.awt.*;
import RayTracer.*;
import Math.*;

public class RayTracerPanel extends JPanel {
    private Camera cam;
    private Sphere sphere;
    private int width;
    private int height;

    public RayTracerPanel(Camera cam, Sphere sphere, int width, int height) {
        this.cam = cam;
        this.sphere = sphere;
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
                double t = sphere.hit(ray);
                if (t > 0.0) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLUE);
                }
                g.drawLine(i, j, i, j);
            }
        }
    }
}