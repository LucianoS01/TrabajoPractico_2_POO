package Empleados;
import java.time.LocalDate;


abstract class Empleados{
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Cuit;
    private LocalDate Fecha;

    public Empleados(String nombre, String apellido, String telefono, String cuit, LocalDate fechaNacimiento) {
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Cuit = cuit;
        Fecha = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return Fecha;
    }

    public abstract  double calcularSueldo();

    protected   double BonoCumpleaños() {
        return 2000;
    }



}

