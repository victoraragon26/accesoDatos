public class ImpresoraTest {
    
    public static void main(String[] args) {
        ImpresoraLaser laser1 = new ImpresoraLaser(55);
        laser1.imprimir("Texto desde impresora Láser");

        ImpresoraTinta tinta1 = new ImpresoraTinta(20);
        tinta1.imprimir("Texto con tinta");

        System.out.println("¿Es láser la más rápida?: " + (laser1.esMasRapida(tinta1)?"Sí":"No"));
    }
}
