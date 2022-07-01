
package paquete4;


public class Propietario {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Propietario(String n, String a, int e) {
        nombre = n;
        apellido = a;
        edad = e;
    }
    
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public int obtenerEdad() {
        return edad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Arriendo de Local Comida\n"
                + "Nombre Arrendatario: %s\n"
                + "Apellido Arrendatario: %s\n"
                + "Edad Arrendatario: %d\n", 
                obtenerNombre(),
                obtenerApellido(),
                obtenerEdad());
        
        return cadena;
    }
    
    

}
