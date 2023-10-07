package Empleados;

import java.time.LocalDate;

public  class EmpleadoPorComision extends Empleados{
    private double PorcentajeBruto;
    private double TotalVentas;

    public EmpleadoPorComision(String nombre, String apellido, String telefono, String cuit, LocalDate fechaNacimiento, double porcentajeBruto, double totalVentas) {
        super(nombre, apellido, telefono, cuit, fechaNacimiento);
        PorcentajeBruto = porcentajeBruto;
        TotalVentas = totalVentas;
    }

    @Override
    public double calcularSueldo(){
        double Sueldo = 0;
        LocalDate fechaDeHoy = LocalDate.now();
        if (fechaDeHoy.getMonth() == getFechaNacimiento().getMonth() && fechaDeHoy.getDayOfMonth() == getFechaNacimiento().getDayOfMonth()) {
            Sueldo = (Sueldo * 5 / 100)  * TotalVentas + BonoCumpleaños();
        }
        else {
            Sueldo = PorcentajeBruto * TotalVentas;
        }
        return (Sueldo);
    }
}
