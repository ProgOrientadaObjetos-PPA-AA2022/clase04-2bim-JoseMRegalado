/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    protected String nombresP;
    protected String placa;
    protected double valorCancelar;
   
    
    public void establecerNombresP(String n){
        nombresP = n;
    }
  
    public void establecerPlaca(String n){
        placa = n;
    }
    
    public abstract void calcularValorCancelar();
    
    public String obtenerNombresP(){
        return nombresP;  
    }
 
    
    public String obtenerPlaca(){
        return placa; 
    }
    
}
