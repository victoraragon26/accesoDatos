import java.time.LocalDateTime;

public class Cuenta {

    private String dni;
    private String nombre;
    private String numCuenta;
    private double saldoCuenta;
    private LocalDateTime fechaIngreso;
    private double cantidadIngreso;
    private LocalDateTime fechaRetirada;
    private double cantidadRetirada;

    private final static double MAXIMO_RETIRAR = 3000;
    private final static double MAXIMO_INGRESAR = 6000;

    public Cuenta(String dni, String nombre, String numCuenta, double saldoCuenta, LocalDateTime fechaIngreso,
            double cantidadIngreso, LocalDateTime fechaRetirada, double cantidadRetirada) {
        this.dni = dni;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.saldoCuenta = saldoCuenta;
        this.fechaIngreso = null;
        this.cantidadIngreso = 0;
        this.fechaRetirada = null;
        this.cantidadRetirada = 0;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getCantidadIngreso() {
        return cantidadIngreso;
    }

    public void setCantidadIngreso(double cantidadIngreso) {
        this.cantidadIngreso = cantidadIngreso;
    }

    public LocalDateTime getFechaRetirada() {
        return fechaRetirada;
    }

    public void setFechaRetirada(LocalDateTime fechaRetirada) {
        this.fechaRetirada = fechaRetirada;
    }

    public double getCantidadRetirada() {
        return cantidadRetirada;
    }

    public void setCantidadRetirada(double cantidadRetirada) {
        this.cantidadRetirada = cantidadRetirada;
    }

    public static double getMaximoRetirar() {
        return MAXIMO_RETIRAR;
    }

    public static double getMaximoIngresar() {
        return MAXIMO_INGRESAR;
    }

    public static boolean validarCuentaBancaria(String sNumCuenta) {
        if (sNumCuenta.length() == 20) {
            String banco = sNumCuenta.substring(0, 4);
            String sucursal = sNumCuenta.substring(4, 8);
            String digitoControl = sNumCuenta.substring(8, 10);
            int primerDigitoOriginal = Integer.parseInt(String.valueOf(digitoControl.charAt(0)));
            int segundoDigitoOriginal = Integer.parseInt(String.valueOf(digitoControl.charAt(1)));
            String CCC = sNumCuenta.substring(10, 20);
            int primerDigitoCalculado = obtenerDigitoControl("00" + banco + sucursal);
            int segundoDigitoCalculado = obtenerDigitoControl(CCC);

            if ((primerDigitoOriginal != primerDigitoCalculado) || (segundoDigitoOriginal != segundoDigitoCalculado)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static int obtenerDigitoControl(String valor) {
        Integer[] valores = new Integer[] { 1, 2, 4, 8, 5, 10, 9, 7, 3, 6 };
        Integer sumaTotal = 0;
        for (int i = 0; i < 10; i++) {
            sumaTotal += valores[i] * Integer.parseInt(String.valueOf(valor.charAt(i)));
        }
        sumaTotal = 11 - (sumaTotal % 11);
        if (sumaTotal == 10) {
            sumaTotal = 1;
        }
        return sumaTotal;
    }

}
