package vista;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Desarrollador;
import modelo.Empleado;
import modelo.Gerente;
import modelo.SalarioInvalido;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) throws SalarioInvalido {

        int opcion;

        do {
            System.out.println("\n========= MENÚ PRINCIPAL =========");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Generar reportes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    registrarEmpleado();
                    break;
                case 2:
                    listarEmpleados();
                    break;
                case 3:
                    listarReportes();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

    }

    // ---------------------- REGISTRAR ----------------------
    public static void registrarEmpleado() throws SalarioInvalido {
        System.out.println("\n--- REGISTRAR EMPLEADO ---");
        System.out.println("1. Desarrollador");
        System.out.println("2. Gerente");
        System.out.print("Seleccione tipo: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Salario base: ");
        double salario = sc.nextDouble();
        sc.nextLine();

        if (tipo == 1) {
            System.out.print("Lenguaje de programación: ");
            String lenguaje = sc.nextLine();

            empleados.add(new Desarrollador(nombre, edad, salario, lenguaje));
            System.out.println("Desarrollador registrado correctamente.");

        } else if (tipo == 2) {
            System.out.print("Departamento: ");
            String departamento = sc.nextLine();


            empleados.add(new Gerente(nombre, edad, salario, departamento));
            System.out.println("Gerente registrado correctamente.");

        } else {
            System.out.println("Tipo inválido.");
        }
    }

    // ---------------------- LISTAR EMPLEADOS ----------------------
    public static void listarEmpleados() {
        System.out.println("\n--- LISTA DE EMPLEADOS ---");

        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        // Usamos generarReporte() para mostrar correctamente los datos
        for (Empleado e : empleados) {
            System.out.println(e.generarReporte());
        }
    }

    // ---------------------- REPORTES ----------------------
    public static void listarReportes() {
        System.out.println("\n--- REPORTES DE EMPLEADOS ---");

        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        for (Empleado e : empleados) {
            System.out.println("-------------------------------------");
            System.out.println(e.generarReporte());
        }
    }
}
