public interface IImpresora {
    
    void imprimir(String texto);
    int getVelocidad();

    default boolean esMasRapida(IImpresora impresora) {
        return this.getVelocidad() > impresora.getVelocidad();
    }
}
