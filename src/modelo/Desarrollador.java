/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
public class Desarrollador  extends Empleado{
    
    private String lenguaje;

    public Desarrollador(String nombre1, int edad1, double salario1, int hijos, String lenguaje1) {
    }

    public Desarrollador(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public Desarrollador(String lenguaje, String nombre, int edad, double salario, int numhijos) throws SalarioInvalido {
        super(nombre, edad, salario, numhijos);
        this.lenguaje = lenguaje;
        totalDesarrolladores++;
    }
   

    @Override
    public double calcularBonificacicon() {
        
        return 20.0*this.numhijos;
    }
    
    
    public String getlenguaje(){
    return lenguaje;
    
    }
    @Override
    public String generarReporte() {
        
        return super.generarReporte()+
        String.format(" | Cargo: Desarrollador  | Lenguaje:   %| Bonificacion:  %", 
                lenguaje, calcularBonificacicon());
    }
    
    }    