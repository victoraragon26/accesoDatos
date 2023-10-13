import java.util.Scanner;

public class PersonaTest {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre >> ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce la edad >> ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Introduce el sexo (H o M) >> ");
        char sexo = entrada.nextLine().charAt(0);
        System.out.print("Introduce el peso (Kg) >> ");
        double peso = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Introduce la altura (metros) >> ");
        double altura = entrada.nextDouble();
        entrada.nextLine();

        Persona persona1 = new Persona(nombre, edad, "", sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, "", sexo, 0, 0);
        Persona persona3 = new Persona();
        persona3.setNombre("Fernando");
        persona3.setDNI("37157541Y");
        persona3.setEdad(33);
        persona3.setSexo('H');
        persona3.setPeso(75);
        persona3.setAltura(1.77);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);

        entrada.close();
    }
}
