package PresupuestoAlquileres;

import java.time.LocalDate;

public class ListaVehiculos {
    private Vehiculo[] lista_Vehiculo;
    private int cantidad;

    public ListaVehiculos(int cantidad) {
        this.lista_Vehiculo = new Vehiculo[cantidad];
        this.cantidad = 0;
    }


    public boolean agregar_vehiculo(String Patente) {
        if (PatenteRepetida(Patente)){
            System.out.println("ERROR : Ya existe esa PATENTE \n");
            System.out.println("Ingrese otra patente \n");
            return false;
        }
        else {
            Vehiculo vehiculo = new Vehiculo(Patente) {
                @Override
                public double CalcularCostoAlquiler(int dias) {
                    return 0;
                }
            };
            this.lista_Vehiculo[this.cantidad] = vehiculo;
            this.cantidad = this.cantidad + 1;
            System.out.println("Se registro COrrectamente la patente:\n" + Patente);
            return true;
        }

    }


    public boolean PatenteRepetida(String Patente){
        for (int i = 0; i < cantidad; i++) {
            if (lista_Vehiculo[i].getPatente().equals(Patente)) {
                return true; // Se encontró la patente repetida
            }
        }
        return false; // La patente no está repetida
    }





}


