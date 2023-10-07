package Empleados;

import java.time.LocalDate;

public class EmpleadoPasante extends Empleados {


    public EmpleadoPasante(String nombre, String apellido, String telefono, String cuit, LocalDate fechaNacimiento) {
        super(nombre, apellido, telefono, cuit, fechaNacimiento);
    }

    @Override
    public double calcularSueldo(){
        return (0);
    }
}
