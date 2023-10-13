public class Nevera extends Electrodomestico {
    private double capacidadFrigorifico;

    private double capacidadCongelador;
    private double sonoridad; // En decibelios

    public Nevera() {
        this.capacidadFrigorifico = 130;
        this.capacidadCongelador = 35;
        this.sonoridad = 4.3;
    }

    public Nevera(String paramMarca, String paramModelo, double paramPrecio, String paramColor, double paramPotencia,
            double paramHorasDia, double paramDiasAnno, double paramPrecioEnergia, double capacidadFrigorifico,
            double capacidadCongelador, double sonoridad) {
        super(paramMarca, paramModelo, paramPrecio, paramColor, paramPotencia, paramHorasDia, paramDiasAnno,
                paramPrecioEnergia);
        this.capacidadFrigorifico = capacidadFrigorifico;
        this.capacidadCongelador = capacidadCongelador;
        this.sonoridad = sonoridad;
    }

    public double consumoAnualNevera() {
        double consumo = super.consumoAnual(sonoridad, capacidadFrigorifico, capacidadCongelador);
        if (this.capacidadFrigorifico > 300 || this.capacidadCongelador > 200) {
            return consumo + 50;
        }
        return consumo;
    }

    public double getCapacidadFrigorifico() {
        return capacidadFrigorifico;
    }

    public void setCapacidadFrigorifico(double capacidadFrigorifico) {
        this.capacidadFrigorifico = capacidadFrigorifico;
    }

    public double getCapacidadCongelador() {
        return capacidadCongelador;
    }

    public void setCapacidadCongelador(double capacidadCongelador) {
        this.capacidadCongelador = capacidadCongelador;
    }

    public double getSonoridad() {
        return sonoridad;
    }

    public void setSonoridad(double sonoridad) {
        this.sonoridad = sonoridad;
    }

    @Override
    public String toString() {
        return super.toString() + "Nevera [capacidadFrigorifico=" + capacidadFrigorifico + ", capacidadCongelador="
                + capacidadCongelador
                + ", sonoridad=" + sonoridad + ", consumoAnual=" + consumoAnualNevera() + "]";
    }

}