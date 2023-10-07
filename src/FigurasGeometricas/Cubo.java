package FigurasGeometricas;

public class Cubo extends Figura3Dimencion{
    private int arista;

    public Cubo(int arista) {
        this.arista = arista;
    }

    @Override
    public double getVolumen() {
        return (arista * arista * arista);
    }

    @Override
    public double get_area_figura() {
        return (6* (arista * arista  * arista));
    }
}



