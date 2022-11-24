public class Trabajador extends Persona {
    
    int salario;

    public Trabajador(int salario, int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
    
    
}