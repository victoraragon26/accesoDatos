package instituto;
public class Persona {
    
    private String nombre;
    private int edad;
    private String aulaAsignada;
    
    public Persona(String nombre, int edad, String aulaAsignada) {
        this.nombre = nombre;
        this.edad = edad;
        this.aulaAsignada = aulaAsignada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAulaAsignada() {
        return aulaAsignada;
    }

    public void setAulaAsignada(String aulaAsignada) {
        this.aulaAsignada = aulaAsignada;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", aulaAsignada=" + aulaAsignada + "]";
    }

}
