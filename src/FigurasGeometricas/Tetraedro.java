package FigurasGeometricas;

public class Tetraedro extends Figura3Dimencion{
    private  int arista;

    public Tetraedro(int arista) {
        this.arista = (arista);

    }

    @Override
    public double getVolumen() {
        return (arista * arista * Math.sqrt(3));
    }

    @Override
    public double get_area_figura() {
        return (6* (arista * arista  * arista * Math.sqrt(2) / 12));
    }

}

