/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

// MainPrincipal.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Desarrollador;
import modelo.Empleado;
import modelo.Gerente;

public class Main {
    private static final List<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean salir = false;
            
            while (!salir) {
                mostrarMenu();
                int opcion = leerInt(sc, "Seleccione opción: ");
                
                switch (opcion) {
                    case 1 -> agregarDesarrollador(sc);
                    case 2 -> agregarGerente(sc);
                    case 3 -> listarReportes();
                    case 4 -> mostrarContadores();
                    case 5 -> salir = true;
                    default -> System.out.println("Opción no válida.");
                }
            }
            
            System.out.println("Fin del programa. ¡Hasta luego!");
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1) Agregar Desarrollador");
        System.out.println("2) Agregar Gerente");
        System.out.println("3) Listar reportes de empleados");
        System.out.println("4) Mostrar contadores");
        System.out.println("5) Salir");
    }

    private static void agregarDesarrollador(Scanner sc) {
        System.out.println("\n--- Agregar Desarrollador ---");
        String nombre = leerString(sc, "Nombre: ");
        int edad = leerInt(sc, "Edad: ");
        double salario = leerDouble(sc, "Salario: ");
        int hijos = leerInt(sc, "Número de hijos: ");
        String lenguaje = leerString(sc, "Lenguaje de programación: ");
        Desarrollador d = new Desarrollador(nombre, edad, salario, hijos, lenguaje);
        empleados.add(d);
        System.out.println("Desarrollador agregado correctamente.");
    }

    private static void agregarGerente(Scanner sc) {
        System.out.println("\n--- Agregar Gerente ---");
        String nombre = leerString(sc, "Nombre: ");
        int edad = leerInt(sc, "Edad: ");
        double salario = leerDouble(sc, "Salario: ");
        int hijos = leerInt(sc, "Número de hijos: ");
        int equipos = leerInt(sc, "Número de equipos a cargo: ");
        Gerente g = new Gerente(nombre, edad, salario, hijos, equipos);
        empleados.add(g);
        System.out.println("Gerente agregado correctamente.");
    }

    private static void listarReportes() {
        System.out.println("\n--- Reportes de empleados ---");
        for (Empleado e : empleados) {
            System.out.println(e.generarReporte());
        }
        if (empleados.isEmpty()) System.out.println("No hay empleados registrados.");
    }

    private static void mostrarContadores() {
        System.out.println("\n--- Contadores ---");
        System.out.println("Total empleados: " + Empleado.getTotalEmpleados());
        System.out.println("Total desarrolladores: " + Empleado.getTotalDesarrolladores());
        System.out.println("Total gerentes: " + Empleado.getTotalGerentes());
    }

    // Métodos auxiliares de lectura con validación básica
    private static int leerInt(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
            }
        }
    }

    private static double leerDouble(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
            }
        }
    }

    private static String leerString(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine().trim();
    }
}