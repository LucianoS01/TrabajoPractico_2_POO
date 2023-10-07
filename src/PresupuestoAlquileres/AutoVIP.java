package PresupuestoAlquileres;

public class AutoVIP extends Vehiculo {
    public AutoVIP(String patente) {
        super(patente);
    }

    @Override
    public double CalcularCostoAlquiler(int dias) {
        return getPrecio_Base() + (500 * dias);
    }
}
