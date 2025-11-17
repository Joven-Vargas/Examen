/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
public abstract class Empleado implements Reportable{

    protected String nombre;
    protected int edad;
    protected double salario;
    protected int numhijos;
    
    protected static  int totalEmpleados=0;
    protected static int totalDesarrolladores=0;
    protected static int totalGerentes=0;

    public Empleado() {
    }

    
    public Empleado(String nombre, int edad, double salario, int numhijos) throws SalarioInvalido {
        if(salario < 0 )throw new SalarioInvalido("El salario no puede see negativo ");
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.numhijos = numhijos;
        totalEmpleados++;
    }
    public abstract double calcularBonificacicon();

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

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumhijos() {
        return numhijos;
    }

    public void setNumhijos(int numhijos) {
        this.numhijos = numhijos;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }

    public static int getTotalDesarrolladores() {
        return totalDesarrolladores;
    }

    public static void setTotalDesarrolladores(int totalDesarrolladores) {
        Empleado.totalDesarrolladores = totalDesarrolladores;
    }

    public static int getTotalGerentes() {
        return totalGerentes;
    }

    public static void setTotalGerentes(int totalGerentes) {
        Empleado.totalGerentes = totalGerentes;
    }

 
    
    
    @Override
    public String generarReporte() {
        return String.format("Empleado: % | Edad:  %| Salario:   %| Hijos:  %", 
                nombre, edad,salario,numhijos);

    }
    
}
