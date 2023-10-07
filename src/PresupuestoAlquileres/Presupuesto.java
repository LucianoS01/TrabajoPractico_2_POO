package PresupuestoAlquileres;

public class Presupuesto {
    private Vehiculo vehiculo;
    private int dias;
    private int DNi_cliente;

    public Presupuesto(Vehiculo vehiculo, int dias, int DNi_cliente) {
        this.vehiculo = vehiculo;
        this.dias = dias;
        this.DNi_cliente = DNi_cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public double calcularMonto() {
        return vehiculo.CalcularCostoAlquiler(dias);
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}
