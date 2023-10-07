package FigurasGeometricas;

public  class Esfera extends Figura3Dimencion{
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double getVolumen() {
        return ((4/3) * Math.PI * radio * radio * radio) ;
    }

    @Override
    public double get_area_figura() {
        return (4 * Math.PI * radio * radio) ;
    }
}
