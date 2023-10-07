package FigurasGeometricas;

public  class Circulo extends Figura2Dimencion {

    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getRadio() {
        return radio;
    }

    @Override
    public double get_area_figura() {
        return Math.PI * radio * radio;
    }

}
