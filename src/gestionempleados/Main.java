1/*
 * Diseñar y desarrollar un sistema de gestión de empleados en Java utilizando el enfoque de programación orientada a objetos 
 * en modo consola. La aplicación debe permitir a los usuarios agregar empleados, asignarles información como nombre, edad y salario, 
 * y mostrar los detalles de los empleados existentes.

 * Requisitos:
 * Crear una clase Empleado con los atributos privados necesarios, como nombre, edad y salario.
 * Implementar métodos públicos en la clase Empleado para acceder y modificar los atributos, como obtener el nombre, establecer la 
   edad o imprimir la información del empleado.
 * Aplicar el encapsulamiento adecuado utilizando modificadores de acceso para proteger los datos de los empleados y garantizar el 
   acceso controlado a través de los métodos públicos.
 * Crear una clase GestorEmpleados que contenga una lista de objetos Empleado y métodos para realizar operaciones como agregar 
   empleados y mostrar los detalles de los empleados existentes.
 * En la clase Main, en el método main, los estudiantes deben crear instancias de GestorEmpleados y probar las funcionalidades 
   implementadas, como agregar empleados y mostrar los detalles de los empleados existentes.
 */
package gestionempleados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestorEmpleados = new GestorEmpleados();
        int opc;

        do {
            System.out.println("Menu");
            System.out.println("Elija una opcion");
            System.out.println("1. Agregar empleados");
            System.out.println("2. Modificar empleados");
            System.out.println("3. Mostrar detalles");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Agregar empleados");

                    gestorEmpleados.agregarEmpleado(new Empleado("Juan", 30, 2500));
                    gestorEmpleados.agregarEmpleado(new Empleado("Maria", 35, 2800));

                    gestorEmpleados.mostrarDetallesEmpleados();

                    break;
                case 2:
                    System.out.println("Modificar empleados");
                    System.out.println("Ingrese el nombre del empleado que desea modificar:");
                    String nombreEmpleado = scanner.next();
                    System.out.println("Ingrese la nueva edad:");
                    int nuevaEdad = scanner.nextInt();
                    System.out.println("Ingrese el nuevo salario:");
                    double nuevoSalario = scanner.nextDouble();

                    gestorEmpleados.modificarEmpleado(nombreEmpleado, nuevaEdad, nuevoSalario);

                    gestorEmpleados.mostrarDetallesEmpleados();

                    break;

                case 3:
                    System.out.println("Mostrar detalles de empleados");
                    gestorEmpleados.mostrarDetallesEmpleados();
                    break;
                default:
                    System.out.println("Salir");
                    System.exit(0);
            }
        } while (opc <= 3);
    }
}
