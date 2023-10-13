public class OrdenadorTest {
    
    public static void main(String[] args) {
        Portatil portatil1 = new Portatil(13, 32, "Ryzen 7 5800H", 1200, 3);
        Sobremesa sobremesa1 = new Sobremesa(10, 16, "i7-13700K", 1100, "Full tower");

        portatil1.mostrarInformacion();
        sobremesa1.mostrarInformacion();
    }
}
