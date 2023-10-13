import java.time.LocalTime;

public class Vehiculo {
    
    private String matricula;
    private LocalTime fechaInicio;
    private LocalTime fechaFin;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
    }
}
