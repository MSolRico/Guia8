/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Ejercicio3.Entidades.Persona;
import Ejercicio3.Servicio.ServicioPersona;

/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        Persona[] vector = new Persona[4];
        boolean[] mayor = new boolean[4];
        int[] imc = new int[4];
        
        for (int i = 0; i < 4; i++) {
            vector[i] = sp.crearPersona();
            System.out.println(vector[i].toString());
            System.out.println(vector[i].getNombre() + " es mayor de edad: " + sp.esMayorDeEdad(vector[i]));
            mayor[i] = sp.esMayorDeEdad(vector[i]);
            imc[i] = sp.calcularIMC(vector[i]);
            System.out.println("--------------------------------------------------");
        }
        
        sp.porcentajeIMC(imc);
        sp.porcentajeMayor(mayor);

    }
    
}
