package PresupuestoAlquileres;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String Nombre_Cliente;
    private int DNI_cliente;
    private List<Alquiler> alquileres;

    public Cliente(String nombre_Cliente, int DNI_cliente) {
        Nombre_Cliente = nombre_Cliente;
        this.DNI_cliente = DNI_cliente;
        this.alquileres = new ArrayList<>();
    }

    public  Presupuesto SolicitarPresupuesto(Vehiculo Tipo_Vehiculo, int Dias){
        Presupuesto presupuesto = new Presupuesto(Tipo_Vehiculo, Dias, this.DNI_cliente);
        double monto = presupuesto.calcularMonto();
        System.out.println("Presupuesto para " + Tipo_Vehiculo.getPatente() + ": $" + monto);
        return presupuesto;
    };

    //Genemos una lista de Alquieres por cliente:
    public Alquiler generarAlquiler(Presupuesto presupuesto) {
        Alquiler alquiler = new Alquiler(this, presupuesto);
        alquileres.add(alquiler);
        System.out.println("Alquiler de " + presupuesto.getVehiculo().getPatente() + " por " + presupuesto.getDias() + " días. Costo: $" + presupuesto.calcularMonto());
        return alquiler;
    }

    public double getMontoTotalAlquileres() {
        double montoTotal = 0;
        for (Alquiler alquiler : alquileres) {
            montoTotal = montoTotal +  alquiler.MonTOFInal();
        }
        return montoTotal;
    }

}
