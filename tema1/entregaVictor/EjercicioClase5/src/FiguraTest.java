public class FiguraTest {
    
    public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo(5, 4);
        Circulo circulo1 = new Circulo(2.8);
        Triangulo triangulo1 = new Triangulo(3, 4);
        Figura[] listaFiguras = {rectangulo1, circulo1, triangulo1};
        for (int i = 0; i < listaFiguras.length; i++) {
            listaFiguras[i].calcularArea();
            listaFiguras[i].mostrarArea();
        }
    }
}
