import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso; // En Kg
    private double altura; // En metros

    char[] letraDNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
            'L', 'C', 'K', 'E' };

    static final char HOMBRE = 'H';
    static final char MUJER = 'M';

    public Persona() {
        this.nombre = generarDNI();
        this.sexo = HOMBRE;
        this.DNI = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        if (validaDNI(DNI)) {
            this.DNI = DNI;
        } else {
            this.DNI = generarDNI(); // Generar un DNI aleatorio si el DNI no es válido
        }
        if (validaSexo(sexo))
            this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    private boolean validaDNI(String DNI) {
        if (DNI.length() != 9 || letraDNI[(Integer.parseInt(DNI.substring(0, 8))) % 23] != DNI.charAt(8)) {
            return false;
        }
        generarDNI();
        return true;
    }

    private boolean validaSexo(char sexo) {
        return sexo == HOMBRE || sexo == MUJER;
    }


    private String generarDNI() {
        var dniAleatorio = new Random();
        int numDNI;
        String DNI = "";
        char letra;
        if (DNI.isEmpty()) {
            for (int i = 1; i < 9; i++) {
                numDNI = dniAleatorio.nextInt(9);
                DNI = DNI + numDNI;
            }
        }
        letra = letraDNI[Integer.parseInt(DNI) % 23];
        return DNI + letra;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static char getHombre() {
        return HOMBRE;
    }

    public static char getMujer() {
        return MUJER;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + ", IMC=" + calcularIMC() + "]";
    }

}
