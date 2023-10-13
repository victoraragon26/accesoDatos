import java.util.ArrayList;

public class ElectrodTest {
    public static void main(String[] args) {
        // Creamos el ArrayList de Electrodomesticos
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        // Creamos los Electrodomesticos
        Electrodomestico electrodomestico1 = new Electrodomestico("Samsung", "T-343", 500, "blanco", 330, 2, 3 * 52, 0.53);
        Electrodomestico electrodomestico2 = new Electrodomestico("LG", "M43", 150, "gris", 250, 1, 5 * 52, 0.3);
        Electrodomestico televisor1 = new Televisor("Samsung", "OLED55", 900, "negro", 100, 2, 6 * 52, 0.13, 55);
        Electrodomestico nevera1 = new Nevera("Bosch", "123", 600, "blanca", 300, 24, 7 * 52, 0.08, 300, 200, 5.3);
        


        // Agregamos los Electrodomesticos al ArrayList
        electrodomesticos.add(electrodomestico1);
        electrodomesticos.add(electrodomestico2);
        electrodomesticos.add(televisor1);
        electrodomesticos.add(nevera1);

        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println(electrodomestico);
        }
    }
}
