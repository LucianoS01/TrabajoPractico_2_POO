package PresupuestoAlquileres;

public class AutoPasajero extends Vehiculo {
    private int Asiento;


    public AutoPasajero(String patente, int asiento) {
        super(patente);
        Asiento = asiento;
    }



    @Override
    public double CalcularCostoAlquiler(int dias) {
        return getPrecio_Base() + (300 * Asiento * dias);
    }
}
