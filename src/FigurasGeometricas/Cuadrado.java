package FigurasGeometricas;

public class Cuadrado extends Figura_geometrica{
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double get_area_figura() {
        return lado * lado;
    }
}
