import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ParkingVehiculo implements IParking {

    private static final double PRECIO_MINUTO = 0.0425;
    private static final int MAX_PLAZAS = 100;

    private String direccionParking;
    private int plazasOcupadas;
    private List<Vehiculo> vehiculosAparcados = new ArrayList<>();

    public ParkingVehiculo(String direccionParking) {
        this.direccionParking = direccionParking;
    }

    public String getDireccionParking() {
        return direccionParking;
    }

    public void setDireccionParking(String direccionParking) {
        this.direccionParking = direccionParking;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
        this.plazasOcupadas = 0;
    }

    public List<Vehiculo> getVehiculosAparcados() {
        return vehiculosAparcados;
    }

    public void setVehiculosAparcados(List<Vehiculo> vehiculosAparcados) {
        this.vehiculosAparcados = vehiculosAparcados;
    }

    @Override
    public boolean hayPlaza() {
        return plazasOcupadas < MAX_PLAZAS;
    }

    @Override
    public void aparcaChoche(Vehiculo vehiculo) {
        if (hayPlaza()) {
            vehiculosAparcados.add(vehiculo);
            vehiculo.setFechaInicio(LocalTime.now());
            plazasOcupadas++;
            System.out.println("Vehiculo con matrícula " + vehiculo.getMatricula() + " aparcado.");
        } else {
            System.out.println("Parking completo");
        }
    }

    @Override
    public void sacaCoche(Vehiculo vehiculo) {
        if (vehiculosAparcados.contains(vehiculo)) {
            vehiculosAparcados.remove(vehiculo);
            vehiculo.setFechaFin(LocalTime.now().plusMinutes(55)); // He sumado 55 minutos para comprobar que funciona
            plazasOcupadas--;
            System.out.println("Vehiculo con matrícula " + vehiculo.getMatricula() + " sale del parking.");
        } else {
            System.out.println("Vehiculo no encontrado");
        }
    }

    @Override
    public double getFactura(Vehiculo vehiculo) {
        return (vehiculo.getFechaInicio().until(vehiculo.getFechaFin(), ChronoUnit.MINUTES)) * PRECIO_MINUTO;
    }
    
}
