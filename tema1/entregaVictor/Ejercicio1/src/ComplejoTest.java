public class ComplejoTest {
    public static void main(String[] args) {
        
        Complejo numero1 = new Complejo(5, 3);
        Complejo numero2 = new Complejo(4.2, 2.1);

        numero1.imprimir();
        numero2.imprimir();

        numero1.asignar(4, -5);
        numero1.imprimir();

        Complejo suma = new Complejo();
        suma = suma.sumar(numero1, numero2);
        System.out.print("Suma >> ");
        suma.imprimir();
    }
}
