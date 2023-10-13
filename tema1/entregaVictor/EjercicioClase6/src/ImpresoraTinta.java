public class ImpresoraTinta implements IImpresora {

    private int velocidad;

    public ImpresoraTinta(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void imprimir(String texto) {
        System.out.println(texto);
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
