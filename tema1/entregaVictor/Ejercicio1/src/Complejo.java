public class Complejo {

    private double dPReal;
    private double dPImag;

    public Complejo() {
        
    }

    public Complejo(double dPReal, double dPImag) {
        this.dPReal = dPReal;
        this.dPImag = dPImag;
    }

    public double getdPReal() {
        return dPReal;
    }

    public void setdPReal(double dPReal) {
        this.dPReal = dPReal;
    }

    public double getdPImag() {
        return dPImag;
    }

    public void setdPImag(double dPImag) {
        this.dPImag = dPImag;
    }

    @Override
    public String toString() {
        return "Complejo [dPReal=" + dPReal + ", dPImag=" + dPImag + "]";
    }

    public void asignar(double x, double y) {
        this.dPReal = x;
        this.dPImag = y;
    }

    public Complejo sumar(Complejo c1, Complejo c2) {
        double sumaReal = c1.getdPReal() + c2.getdPReal();
        double sumaImag = c1.getdPImag() + c2.getdPImag();
        Complejo resultado = new Complejo(sumaReal, sumaImag);

        return resultado;
    }

    public void imprimir() {
        System.out.println(toString());
    }
}
