package modelo;

public class Desarrollador extends Empleado {

    private String lenguaje;
    private int lineasCodigo;

    // Constructor principal que inicializa todo
    public Desarrollador(String nombre, int edad, double salario, int numhijos,
                         String lenguaje, int lineasCodigo) throws SalarioInvalido {
        super(nombre, edad, salario, numhijos); // inicializa atributos de Empleado
        this.lenguaje = lenguaje;
        this.lineasCodigo = lineasCodigo;
    }

    // Constructor simplificado para tu Main (sin numhijos y lineasCodigo)
    public Desarrollador(String nombre, int edad, double salario, String lenguaje) throws SalarioInvalido {
        super(nombre, edad, salario, 0); // numhijos = 0 por defecto
        this.lenguaje = lenguaje;
        this.lineasCodigo = 0; // 0 por defecto
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getLineasCodigo() {
        return lineasCodigo;
    }

    public void setLineasCodigo(int lineasCodigo) {
        this.lineasCodigo = lineasCodigo;
    }

  

    
    
    @Override
    public String generarReporte() {
        return super.generarReporte() 
               + " | Lenguaje: " + lenguaje 
               + " | Líneas: " + lineasCodigo;
    }
}
