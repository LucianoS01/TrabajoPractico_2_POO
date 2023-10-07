package FigurasGeometricas;

public class Rectangulo extends Figura_geometrica {
    private int base;
    private int altura;


    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double get_area_figura() {
        return base * altura;
    }
}
