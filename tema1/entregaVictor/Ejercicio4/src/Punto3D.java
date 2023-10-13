public class Punto3D {
    
    private int x;
    private int y;
    private int z;
    
    public Punto3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Punto3D [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    double distancia (Punto3D otroPunto3D) {
        int x2 = this.x - otroPunto3D.getX();
        int y2 = this.y - otroPunto3D.getY();
        int z2 = this.z - otroPunto3D.getZ();

        return x2 * x2 + y2 * y2 + z2 * z2;
    }
}
