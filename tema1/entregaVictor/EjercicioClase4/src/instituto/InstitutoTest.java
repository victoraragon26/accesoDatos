package instituto;

import java.util.ArrayList;

public class InstitutoTest {
    
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Juan", 30, "2.6", "Base de datos");
        Profesor profesor2 = new Profesor("Miguel", 31, "2.7", "Aplicaciones Web");
        ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
        listaProfesores.add(profesor1);
        listaProfesores.add(profesor2);

        Alumno alumno1 = new Alumno("Pepe", 18, "2.6", 5);
        Alumno alumno2 = new Alumno("Fernando", 19, "2.6", 6);
        ArrayList<Alumno> listaAlumnos26 = new ArrayList<Alumno>();
        listaAlumnos26.add(alumno1);
        listaAlumnos26.add(alumno2);
    }
}
