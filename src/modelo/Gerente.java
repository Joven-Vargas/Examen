/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
public class Gerente extends Empleado{
private int numEquipoACargo;

    public Gerente(String nombre1, int numEquipoACargo, double salario1, int hijos, int equipos) {
        this.numEquipoACargo = numEquipoACargo;
    }

    public Gerente(int numEquipoACargo, String nombre, int edad, double salario, int numhijos) throws SalarioInvalido {
        super(nombre, edad, salario, numhijos);
        this.numEquipoACargo = numEquipoACargo;
    }


    @Override
    public double calcularBonificacicon() {
        return 10.0* this.numhijos ;
    }
    
      @Override
    public String generarReporte() {
        
        return super.generarReporte()+
        String.format(" | Cargo: Gerente  | Equipos:   %| Bonificacion:  %", 
                numEquipoACargo, calcularBonificacicon());
    }
    
    
}
