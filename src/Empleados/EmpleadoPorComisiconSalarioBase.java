package Empleados;

import java.time.LocalDate;

public class EmpleadoPorComisiconSalarioBase extends EmpleadoPorComision{
    private double SalarioSumaFija;


    public EmpleadoPorComisiconSalarioBase(String nombre, String apellido, String telefono, String cuit, LocalDate fechaNacimiento, double porcentajeBruto, double totalVentas, double salarioSumaFija) {
        super(nombre, apellido, telefono, cuit, fechaNacimiento, porcentajeBruto, totalVentas);
        SalarioSumaFija = salarioSumaFija;
    }

    @Override
    public double calcularSueldo(){
        double Sueldo = 0;
        LocalDate fechaDeHoy = LocalDate.now();
        if (fechaDeHoy.getMonth() == getFechaNacimiento().getMonth() && fechaDeHoy.getDayOfMonth() == getFechaNacimiento().getDayOfMonth()) {
            Sueldo = super.calcularSueldo() + SalarioSumaFija + 1000;
        }
        else {
            Sueldo = super.calcularSueldo() + SalarioSumaFija;
        }
       return (Sueldo) ;
    }


}
