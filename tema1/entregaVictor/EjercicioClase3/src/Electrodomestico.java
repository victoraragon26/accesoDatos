public class Electrodomestico {
    private String marca;
    private String modelo;
    private double precio;
    private String color;
    private double potenciaWatios;
    private double horasUsoDiario;
    private double diasUsoAnual;
    private double precioEnergia; // €/kWh

    public Electrodomestico() {
        this.marca = "bosch";
        this.modelo = "7200";
        this.precio = 400;
        this.color = "gris";
        this.potenciaWatios = 2300;
        this.horasUsoDiario = 1;
        this.diasUsoAnual = 3 * 52; // Ya que nos indican 3 dias a la semana y un año tiene 52 semanas
        this.precioEnergia = 0.40397;
    }

    public Electrodomestico(String paramMarca, String paramModelo,
            double paramPrecio) {
        this.marca = paramMarca;
        this.modelo = paramModelo;
        this.precio = paramPrecio;
    }

    public Electrodomestico(String paramMarca, String paramModelo,
            double paramPrecio, String paramColor, double paramPotencia,
            double paramHorasDia, double paramDiasAnno, double paramPrecioEnergia) {
        this.marca = paramMarca;
        this.modelo = paramModelo;
        this.precio = paramPrecio;
        this.color = paramColor;
        this.potenciaWatios = paramPotencia;
        this.horasUsoDiario = paramHorasDia;
        this.diasUsoAnual = paramDiasAnno;
        this.precioEnergia = paramPrecioEnergia;
    }

    public double consumoAnual(double potencia, double horasDiarias,
            double diasAnno) {
        return potencia * horasDiarias * diasAnno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPotenciaWatios() {
        return potenciaWatios;
    }

    public void setPotenciaWatios(double potenciaWatios) {
        this.potenciaWatios = potenciaWatios;
    }

    public double getHorasUsoDiario() {
        return horasUsoDiario;
    }

    public void setHorasUsoDiario(double horasUsoDiario) {
        this.horasUsoDiario = horasUsoDiario;
    }

    public double getDiasUsoAnual() {
        return diasUsoAnual;
    }

    public void setDiasUsoAnual(double diasUsoAnual) {
        this.diasUsoAnual = diasUsoAnual;
    }

    public double getPrecioEnergia() {
        return precioEnergia;
    }

    public void setPrecioEnergia(double precioEnergia) {
        this.precioEnergia = precioEnergia;
    }

    @Override
    public String toString() {
        return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
                + ", potenciaWatios=" + potenciaWatios + ", horasUsoDiario=" + horasUsoDiario + ", diasUsoAnual="
                + diasUsoAnual + ", precioEnergia=" + precioEnergia + ", consumoAnual=" + consumoAnual(potenciaWatios, horasUsoDiario, diasUsoAnual) + "]";
    }

}
