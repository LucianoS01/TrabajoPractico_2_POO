package PresupuestoAlquileres;

public class CamionFlete extends Vehiculo {

    private  double PAT;
    public CamionFlete(String patente, double PAT) {
        super(patente);
        this.PAT = PAT;
    }


    @Override
    public double CalcularCostoAlquiler(int dias) {
        return getPrecio_Base() + (600 * PAT * dias);
    }
}
