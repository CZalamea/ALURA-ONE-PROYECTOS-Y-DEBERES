public class Cliente extends Persona {
    
    String credito;

    public Cliente(String credito, int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }
    
    
}