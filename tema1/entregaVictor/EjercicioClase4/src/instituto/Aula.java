package instituto;

import java.util.Arrays;

public class Aula {

    private String nombreAula;
    private int numEstudiantes;
    private String[] profesoresAula;
    private String[] alumnosAula;
    private String[] materiasAula;

    public Aula(String nombreAula, int numEstudiantes, String[] profesoresAula, String[] alumnosAula,
            String[] materiasAula) {
        this.nombreAula = nombreAula;
        this.numEstudiantes = numEstudiantes;
        this.profesoresAula = profesoresAula;
        this.alumnosAula = alumnosAula;
        this.materiasAula = materiasAula;
    }

    public String getNombreAula() {
        return nombreAula;
    }

    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public String[] getProfesoresAula() {
        return profesoresAula;
    }

    public void setProfesoresAula(String[] profesoresAula) {
        this.profesoresAula = profesoresAula;
    }

    public String[] getAlumnosAula() {
        return alumnosAula;
    }

    public void setAlumnosAula(String[] alumnosAula) {
        this.alumnosAula = alumnosAula;
    }

    public String[] getMateriasAula() {
        return materiasAula;
    }

    public void setMateriasAula(String[] materiasAula) {
        this.materiasAula = materiasAula;
    }

    @Override
    public String toString() {
        return "Aula [nombreAula=" + nombreAula + ", numEstudiantes=" + numEstudiantes + ", profesoresAula="
                + Arrays.toString(profesoresAula) + ", alumnosAula=" + Arrays.toString(alumnosAula) + ", materiasAula="
                + Arrays.toString(materiasAula) + "]";
    }

}
