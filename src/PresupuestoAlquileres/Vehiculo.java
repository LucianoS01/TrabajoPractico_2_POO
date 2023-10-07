package PresupuestoAlquileres;

abstract class Vehiculo {
    private String Patente;
    private double Precio_Base;

    public Vehiculo(String patente) {
        Patente = patente;
        this.Precio_Base = 3000;
    }

    public double getPrecio_Base() {
        return Precio_Base;
    }

    public void setPrecio_Base(double precio_Base) {
        Precio_Base = precio_Base;
    }

    public abstract  double CalcularCostoAlquiler(int dias);

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }
}
