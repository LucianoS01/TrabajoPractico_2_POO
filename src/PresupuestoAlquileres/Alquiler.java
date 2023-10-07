package PresupuestoAlquileres;

public class Alquiler {
    private Cliente DNI_CLIENTE;
    private Presupuesto presupuesto;



    public Alquiler(Cliente DNI_CLIENTE, Presupuesto presupuesto) {
        this.DNI_CLIENTE = DNI_CLIENTE;
        this.presupuesto = presupuesto;
    }



    public double MonTOFInal(){
      return presupuesto.getVehiculo().CalcularCostoAlquiler(presupuesto.getDias());
    };


}
