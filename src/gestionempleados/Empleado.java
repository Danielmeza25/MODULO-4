package gestionempleados;

class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
    }

    public void establecerSalario(double salario) {
        this.salario = salario;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}