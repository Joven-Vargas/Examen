package modelo;

public class Gerente extends Empleado {

    private String departamento;
    private int numEmpleadosCargo;

    // Constructor principal
    public Gerente(String nombre, int edad, double salario, int numhijos,
                   String departamento, int numEmpleadosCargo) throws SalarioInvalido {
        super(nombre, edad, salario, numhijos);
        this.departamento = departamento;
        this.numEmpleadosCargo = numEmpleadosCargo;
    }

    // Constructor simplificado para tu Main
    public Gerente(String nombre, int edad, double salario, String departamento) throws SalarioInvalido {
        super(nombre, edad, salario, 0); // numhijos = 0 por defecto
        this.departamento = departamento;
        this.numEmpleadosCargo = 0; // 0 por defecto
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumEmpleadosCargo() {
        return numEmpleadosCargo;
    }

    public void setNumEmpleadosCargo(int numEmpleadosCargo) {
        this.numEmpleadosCargo = numEmpleadosCargo;
    }

    
    
    @Override
    public String generarReporte() {
        return super.generarReporte()
             + " | Departamento: " + departamento
             + " | Empleados a cargo: " + numEmpleadosCargo;
    }
}
