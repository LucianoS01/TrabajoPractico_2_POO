
package Empleados;

import java.time.LocalDate;

public class EmpleadoAsalariado extends  Empleados{
    private double SueldoTiempoCompleto;

    public EmpleadoAsalariado(String nombre, String apellido, String telefono, String cuit, LocalDate fechaNacimiento, double sueldoTiempoCompleto) {
        super(nombre, apellido, telefono, cuit, fechaNacimiento);
        SueldoTiempoCompleto = sueldoTiempoCompleto;
    }

    @Override
    public double calcularSueldo(){
        LocalDate fechaDeHoy = LocalDate.now();
        if (fechaDeHoy.getMonth() == getFechaNacimiento().getMonth() && fechaDeHoy.getDayOfMonth() == getFechaNacimiento().getDayOfMonth()) {
            return SueldoTiempoCompleto + BonoCumpleaños() + 1000.0;
        } else {
            return SueldoTiempoCompleto;
        }
    }
}
