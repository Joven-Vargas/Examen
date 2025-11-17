/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * Clase base abstracta para empleados.
 */
public abstract class Empleado implements Reportable {

    protected String nombre;
    protected int edad;
    protected double salario;
    protected int numhijos;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario, int numhijos) throws SalarioInvalido {
        this.nombre = nombre;
        this.edad = edad;
        setSalario(salario); // valida salario
        this.numhijos = numhijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    /**
     * Valida que el salario no sea negativo. Lanza SalarioInvalido si es negativo.
     */
    public void setSalario(double salario) throws SalarioInvalido {
        if (salario < 0) {
            throw new SalarioInvalido("El salario no puede ser negativo: " + salario);
        }
        this.salario = salario;
    }

    public int getNumhijos() {
        return numhijos;
    }

    public void setNumhijos(int numhijos) {
        this.numhijos = numhijos;
    }

  
    @Override
    public String generarReporte() {
        return String.format(
            "Empleado: %s | Edad: %d | Salario: %.2f | Hijos: %d",
            nombre,
            edad,
            salario,
            numhijos
        );
    }
}

