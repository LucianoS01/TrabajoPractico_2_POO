package PresupuestoAlquileres;

public class Combis extends Vehiculo {

    public Combis(String patente) {
               super(patente);
               setPrecio_Base(4500);
    }

    @Override
    public double CalcularCostoAlquiler(int dias) {
        return getPrecio_Base() * dias;
    }

}
