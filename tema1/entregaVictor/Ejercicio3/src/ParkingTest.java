public class ParkingTest {
    
    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Vehiculo("6745LNN");
        Vehiculo vehiculo2 = new Vehiculo("3829FPW");
        Vehiculo vehiculo3 = new Vehiculo("2219MCJ");
        Vehiculo vehiculo4 = new Vehiculo("1349MDD");
        Vehiculo vehiculo5 = new Vehiculo("3922GHJ");

        ParkingVehiculo parking1 = new ParkingVehiculo("Calle Antonio Lopez 155");

        parking1.aparcaChoche(vehiculo1);
        parking1.aparcaChoche(vehiculo2);
        parking1.aparcaChoche(vehiculo3);
        parking1.aparcaChoche(vehiculo4);
        parking1.aparcaChoche(vehiculo5);

        parking1.sacaCoche(vehiculo1);

        System.out.println(parking1.getFactura(vehiculo1) + " euros. El coche con matrícula " + vehiculo1.getMatricula());

    }
}
