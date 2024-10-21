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

    public Vector3D multiply(Vector3D other) {
        return new Vector3D(this.x * other.x, this.y * other.y, this.z * other.z);
    }

    public Vector3D divide(Vector3D other) {
        return new Vector3D(this.x / other.x, this.y / other.y, this.z / other.z);
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

    public Vector3D multiplyAssign(Vector3D other) {
        this.x *= other.x;
        this.y *= other.y;
        this.z *= other.z;
        return this;
    }

    public Vector3D divideAssign(Vector3D other) {
        this.x /= other.x;
        this.y /= other.y;
        this.z /= other.z;
        return this;
    }

    public Vector3D multiply(double value) {
        return new Vector3D(this.x * value, this.y * value, this.z * value);
    }

    public Vector3D divide(double value) {
        return new Vector3D(this.x / value, this.y / value, this.z / value);
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
}