package FigurasGeometricas;

public   class Paralelepipedo  extends  Figura3Dimencion{

    private int aristas1,aristas2,aristas3;


    public Paralelepipedo(int aristas1, int aristas2, int aristas3) {
        this.aristas1 = aristas1;
        this.aristas2 = aristas2;
        this.aristas3 = aristas3;
    }

    @Override
    public double getVolumen() {
        return (aristas1 * aristas2 * aristas3);
    }

    @Override
    public double get_area_figura() {
        return (2* (aristas1 * aristas2 + aristas1 * aristas3 + aristas2 * aristas3));
    }
}
