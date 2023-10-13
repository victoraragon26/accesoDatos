package instituto;

public class Alumno extends Persona {

    private double nota;

    public Alumno(String nombre, int edad, String aulaAsignada, double nota) {
        super(nombre, edad, aulaAsignada);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno [nota=" + nota + "]";
    }

}
