package Math;

import Math.Matrix;

public class Vector3D {
    public double x, y, z;

    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector3D subtract(Vector3D other) {
        return new Vector3D(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public Vector3D multiply(double value) {
        return new Vector3D(this.x * value, this.y * value, this.z * value);
    }

    public Vector3D divide(double value) { //Review this
        return new Vector3D(this.x / value, this.y / value, this.z / value);
    }

    public Vector3D addAssign(Vector3D other) {
        this.x += other.x;
        this.y += other.y;
        this.z += other.z;
        return this;
    }

    public Vector3D subtractAssign(Vector3D other) {
        this.x -= other.x;
        this.y -= other.y;
        this.z -= other.z;
        return this;
    }

    public Vector3D multiplyAssign(double value) {
        this.x *= value;
        this.y *= value;
        this.z *= value;
        return this;
    }

    public Vector3D divideAssign(double value) {
        this.x /= value;
        this.y /= value;
        this.z /= value;
        return this;
    }

    public double dot(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    @Override
    public String toString() {
        return "Vector3D(" + x + ", " + y + ", " + z + ")";
    }

    public Matrix toMatrix() {
        return new Matrix(new double[][]{{x}, {y}, {z}, {1}});
    }

    public static Vector3D fromMatrix(Matrix matrix) {
        double[][] data = matrix.getData();
        return new Vector3D(data[0][0], data[1][0], data[2][0]);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector3D normalize() {
        double length = this.length();
        if (length == 0) {
            throw new ArithmeticException("Cannot normalize a zero-length vector");
        }
        return this.divide(length);
    }
}