/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

public class AutomovilGasolina extends Automovil {

    double numeroGalones;
    double costoGalones;
    double iva = 10;

    public void establecerNumeroGalones(double n) {
        numeroGalones = n;
    }

    public void establecerCostoGalones(double n) {
        costoGalones = n;
    }

    public void establecerIva(double n) {
        iva = n;
    }
    @Override
    public void calcularValorCancelar() {
        valorCancelar = costoGalones * numeroGalones + (iva / 100 * (costoGalones * numeroGalones));
    }
    public double obtenerNumeroGalones() {
        return numeroGalones;
    }

    public double obtenerCostoGalones() {
        return costoGalones;
    }

    public double obtenerIva() {
        return iva;
    }
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    
    

    @Override
    public String toString() {
        String cadena = String.format("Datos para Automovil de Gasolina\n"
                + "Nombres del propietario: %s\n"
                + "Placa: %s\n"
                + "Número máximo de galones: %.2f\n"
                + "Costo del galón: %.2f\n"
                + "IVA: %.0f\n"
                + "Valor a cancelar: %.2f\n",
                obtenerNombresP(),
                obtenerPlaca(),
                obtenerNumeroGalones(),
                obtenerCostoGalones(),
                iva,
                obtenerValorCancelar());

        return cadena;
    }

}
