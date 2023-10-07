package PresupuestoAlquileres;

public class CamionDeCargar extends  Vehiculo{
    private int dias;
    public CamionDeCargar(String patente, int dias) {
        super(patente);
    }
    @Override
    public double CalcularCostoAlquiler(int dias) {
        if (dias > 30){
            return 75000;
        }
        else {
            return 100000;
        }
    }
}
