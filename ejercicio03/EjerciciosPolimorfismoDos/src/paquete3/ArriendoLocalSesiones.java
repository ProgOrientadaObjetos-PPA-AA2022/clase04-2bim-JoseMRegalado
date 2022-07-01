/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;
import paquete4.Propietario;
import paquete2.Arriendo;

/**
 *
 * @author reroes
 */
public class ArriendoLocalSesiones extends Arriendo{
    protected double valorSillas;
    protected double valorAmplificacion;
    
    public ArriendoLocalSesiones(Propietario ar, double cuotaB){
        super(ar, cuotaB);
    }
    
    public ArriendoLocalSesiones(Propietario ar, double cuotaB, double vs, 
            double va){
        super(ar, cuotaB);
        valorSillas = vs;
        valorAmplificacion = va;
    }
    
    public void establecerValorSillas(double x){
        valorSillas = x;
    }
    
    public void establecerValorAmplificacion(double x){
        valorAmplificacion = x;
    }
    
    @Override
    public void establecerArriendoMensual(){
        arriendoMensual = obtenerCuotaBase() + obtenerValorSillas() +
                obtenerValorAmplificacion();
    }
    
    public double obtenerValorSillas(){
        return valorSillas;
    }
    
    public double obtenerValorAmplificacion(){
        return valorAmplificacion;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Arriendo de Local Sesiones\n"
                + "Nombre Arrendatario: %s\n"
                + "Apellido Arrendatario: %s\n"
                + "Edad Arrendatario: %d\n"
                + "Cuota base: %.2f\n"
                + "Valor sillas: %.2f\n"
                + "Valor amplificacion: %.2f\n"
                + "Arriendo Total: %.2f\n", 
                obtenerArrendatario().obtenerNombre(),
                obtenerArrendatario().obtenerApellido(),
                obtenerArrendatario().obtenerEdad(),
                obtenerCuotaBase(),
                obtenerValorSillas(),
                obtenerValorAmplificacion(),
                obtenerArriendoMensual());
        
        return cadena;
    }
}
