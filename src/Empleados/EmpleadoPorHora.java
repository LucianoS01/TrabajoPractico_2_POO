package Empleados;

import java.time.LocalDate;

public class EmpleadoPorHora extends Empleados {
    private int horasDeTrabajo;
    private int MontoFijo;

    public EmpleadoPorHora(String nombre, String apellido, String telefono, String cuit, LocalDate fechaNacimiento, int horasDeTrabajo, int montoFijo) {
        super(nombre, apellido, telefono, cuit, fechaNacimiento);
        this.horasDeTrabajo = horasDeTrabajo;
        MontoFijo = montoFijo;
    }

    @Override
    public double calcularSueldo(){
        double Sueldo =0;
        Sueldo = MontoFijo * horasDeTrabajo;
        LocalDate fechaDeHoy = LocalDate.now();
        if (horasDeTrabajo > 40 && fechaDeHoy.getMonth() == getFechaNacimiento().getMonth() && fechaDeHoy.getDayOfMonth() == getFechaNacimiento().getDayOfMonth() ){
            Sueldo = Sueldo  + (Sueldo * 20 / 100) ;
            Sueldo = Sueldo + BonoCumpleaños();
        }
        else {
            Sueldo = Sueldo  + (Sueldo * 20 / 100);
        }
        return (Sueldo);

    }
}


