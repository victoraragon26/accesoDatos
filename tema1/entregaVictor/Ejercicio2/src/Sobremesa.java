public class Sobremesa extends Ordenador {

    private String tipoTorre;

    public Sobremesa(int codigo, int ram, String cpu, double precio, String tipoTorre) {
        super(codigo, ram, cpu, precio);
        this.tipoTorre = tipoTorre;
    }

    public String getTipoTorre() {
        return tipoTorre;
    }

    public void setTipoTorre(String tipoTorre) {
        this.tipoTorre = tipoTorre;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("\nTipo de torre: " + tipoTorre + "\n");
    }

    
    
}
