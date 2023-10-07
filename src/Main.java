import java.time.LocalDate;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import Empleados.EmpleadoAsalariado;
import Empleados.EmpleadoPorComisiconSalarioBase;
import Empleados.EmpleadoPorComision;
import Empleados.EmpleadoPorHora;
import FigurasGeometricas.* ;
import PresupuestoAlquileres.*;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---- Menú Principal ----");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5 - 10 - 12 - 13");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("11. Ejercicio 11");
            System.out.println("14. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 1




                    //---------------------------------------------------------------------------------------

                    break;
                case 2:
                    //       EJERCICIO 2



                    break;
                case 3:
                    //       EJERCICIO 3

                    break;
                case 4:
                    //       EJERCICIO 4

                    break;
                case 5:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 5


                    //---------------------------------------------------------------------------------------
                    break;
                case 6:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 6


                    //---------------------------------------------------------------------------------------
                    break;
                case 7:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 7

                    //---------------------------------------------------------------------------------------

                    break;
                case 8:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 8


                    System.out.println("---------------------------------------------------------------------------------------");

                    break;
                case 9:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 9
                    System.out.println("Figuras de 2ra Dimension: "  );
                    //Cirulo:
                    Circulo circulo = new Circulo(5.0);
                    // Obtener el radio del círculo
                    System.out.println("- Radio del círculo: " + circulo.getRadio());
                    // Calcular y obtener el área del círculo
                    System.out.println("- Área del círculo: " + circulo.get_area_figura());
                    //---------------------------------------------------------------------------------------
                    //Rectangulo:
                    Rectangulo rectangulo = new Rectangulo(10,8);
                    // Calcular y obtener el área del rectangulo
                    System.out.println("- Área del Rectangulo: " + rectangulo.get_area_figura());
                    //---------------------------------------------------------------------------------------
                    //Cuadrado:
                    Cuadrado cuadrado = new Cuadrado(10);
                    // Calcular y obtener el área del cuadrado
                    System.out.println("- Área del cCuadrado: " + cuadrado.get_area_figura());
                    //---------------------------------------------------------------------------------------
                    //Triangulo:
                    Triangulo triangulo = new Triangulo(5,10);
                    // Calcular y obtener el área del triangulo
                    System.out.println("- Área del Triangulo: " + triangulo.get_area_figura());
                    //---------------------------------------------------------------------------------------
                    System.out.println("Figuras de 3ra Dimension: "  );
                    //Esfera:
                    Esfera esfera = new Esfera(5.0);
                    // Calcular y obtener el área del esfera
                    System.out.println("- Área del esfera: " + esfera.get_area_figura());
                    System.out.println("- Volumen del esfera: " + esfera.getVolumen());
                    //---------------------------------------------------------------------------------------
                    //Paralelepipedo:
                    Paralelepipedo paralelepipedo = new Paralelepipedo(5,4,2);
                    // Calcular y obtener el área del esfera
                    System.out.println("- Área del paralelepipedo: " + paralelepipedo.get_area_figura());
                    System.out.println("- Volumen del paralelepipedo: " + paralelepipedo.getVolumen());
                    //---------------------------------------------------------------------------------------
                    //Cubo:
                    Cubo cubo = new Cubo(5);
                    // Calcular y obtener el área del esfera
                    System.out.println("- Área del cubo: " + cubo.get_area_figura());
                    System.out.println("- Volumen del cubo: " + cubo.getVolumen());
                    //---------------------------------------------------------------------------------------
                    //Tetraedro:
                    Tetraedro tetraedro = new Tetraedro(5);
                    // Calcular y obtener el área del esfera
                    System.out.println("- Área del tetraedro: " + tetraedro.get_area_figura());
                    System.out.println("- Volumen del tetraedro: " + tetraedro.getVolumen());
                    //---------------------------------------------------------------------------------------




                    //---------------------------------------------------------------------------------------
                    break;
                case 10:
                    //---------------------------------------------------------------------------------------
                    LocalDate Fecha_Nacimiento = LocalDate.of(2023, 9, 28);
                    EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Luciano", "Scialchi", "2325688038", "123456789", Fecha_Nacimiento,2000 );
                    EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision ("pepe","zanches","333333","123499",Fecha_Nacimiento,30, 20);
                    EmpleadoPorComisiconSalarioBase empleadoPorComisiconSalarioBase = new EmpleadoPorComisiconSalarioBase("juann", "perez", "33332", "5468975", Fecha_Nacimiento,30, 20, 2000 );
                    EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Stella", "Maris", "9875544", "654789", Fecha_Nacimiento,50, 2000);




                    // Calcular sueldos
                    System.out.println("Sueldo de Empleado asalariado: $" + empleadoAsalariado.calcularSueldo());
                    System.out.println("Sueldo de Empleado por comisión: $" + empleadoPorComision.calcularSueldo());
                    System.out.println("Sueldo de eEmpleado por comisión con salario base: $" + empleadoPorComisiconSalarioBase.calcularSueldo());
                    System.out.println("Sueldo de eEmpleado por hora: $" + empleadoPorHora.calcularSueldo());
                    System.out.println("---------------------------------------------------------------------------------------");





                    //---------------------------------------------------------------------------------------
                    break;
                case 11:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 11

                    ListaVehiculos Lvehiculos = new ListaVehiculos(100);
                    String patente = "ABC123";
                    Lvehiculos.agregar_vehiculo(patente);
                    AutoPasajero autoPasajero =  new AutoPasajero(patente, 4);
                    patente = "DIK738";
                    Lvehiculos.agregar_vehiculo(patente);
                    AutoVIP autoVIP =  new AutoVIP(patente);
                    patente = "XYZ456";
                    Lvehiculos.agregar_vehiculo(patente);
                    Combis combis = new Combis(patente);
                    patente = "yYZ456";
                    Lvehiculos.agregar_vehiculo(patente);
                    CamionDeCargar camionDeCargar = new CamionDeCargar(patente,32);
                    patente = "XkZ456";
                    Lvehiculos.agregar_vehiculo(patente);
                    CamionFlete camionFlete = new CamionFlete(patente,500000);

                    Cliente cliente1 = new Cliente("Luciano Scialchi", 42462286);

                    Presupuesto presupuesto1 = cliente1.SolicitarPresupuesto(combis, 8);
                    Presupuesto presupuesto2 = cliente1.SolicitarPresupuesto(autoPasajero, 20);
                    cliente1.generarAlquiler(presupuesto1);
                    cliente1.generarAlquiler(presupuesto2);

                    // Calcular el monto del alquiler
                    double montoAlquiler1 = cliente1.getMontoTotalAlquileres();
                    System.out.println("Monto del alquiler: $" + montoAlquiler1);


                    //---------------------------------------------------------------------------------------

                    break;
                case 14:

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }

        }
    }
}
