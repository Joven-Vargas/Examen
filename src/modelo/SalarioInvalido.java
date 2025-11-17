/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class SalarioInvalido extends Exception {
    public SalarioInvalido() {
        super("Salario inválido (no puede ser negativo).");
    }

    public SalarioInvalido(String message) {
        super(message);
    }
}
