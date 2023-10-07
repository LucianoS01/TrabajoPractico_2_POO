package FigurasGeometricas;

public class Triangulo extends Figura_geometrica{
    private int base;
    private int altura;


    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double get_area_figura() {
        return (base * altura)/2 ;
    }
}
