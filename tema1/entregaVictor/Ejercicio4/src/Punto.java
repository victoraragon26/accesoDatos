public class Punto {
    
    private int x;
    private int y;
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

    double distancia(Punto otroPunto) {
        int x2 = this.x - otroPunto.getX();
        int y2 = this.y - otroPunto.getY();

        return x2 * x2 + y2 * y2;
    }
}
