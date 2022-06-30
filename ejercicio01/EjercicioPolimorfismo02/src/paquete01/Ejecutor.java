/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;


import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;
public class Ejecutor {
    public static void main(String[] args) {
        
         AutomovilGasolina a1 = new AutomovilGasolina();
         a1.establecerNombresP("Juan Perez");
         a1.establecerPlaca("LBB-1234");
         a1.establecerCostoGalones(3);
         a1.establecerNumeroGalones(20);
         a1.calcularValorCancelar();
         System.out.println(a1);
        AutomovilDiesel a2 = new AutomovilDiesel();
         a2.establecerNombresP("John Doe");
         a2.establecerPlaca("LBA-4584");
         a2.establecerCostoLitros(2);
         a2.establecerNumeroLitros(20);
         a2.calcularValorCancelar();
         System.out.println(a2);
    }
}
