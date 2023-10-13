public class Televisor extends Electrodomestico {
    private int pulgadas;

    public Televisor() {
        this.pulgadas = 55;
    }

    public Televisor(String paramMarca, String paramModelo, double paramPrecio, String paramColor, double paramPotencia,
            double paramHorasDia, double paramDiasAnno, double paramPrecioEnergia, int pulgadas) {
        super(paramMarca, paramModelo, paramPrecio, paramColor, paramPotencia, paramHorasDia, paramDiasAnno,
                paramPrecioEnergia);
        this.pulgadas = pulgadas;
    }

    public double consumoAnualTelevisor() {
        double consumo = super.consumoAnual(pulgadas, pulgadas, pulgadas);
        if (this.pulgadas > 50) {
            return consumo + 30;
        }
        return consumo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return super.toString() + "Televisor [pulgadas=" + pulgadas + ", consumoAnual=" + consumoAnualTelevisor() + "]";
    }

}
