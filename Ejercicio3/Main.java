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
        Persona p1 = sp.crearPersona();
        System.out.println(p1.toString());
        System.out.print(p1.getNombre() + " es mayor de edad: "  +"\n"+ sp.calcularIMC(p1) +"\n"+ sp.esMayorDeEdad(p1));
        System.out.println("");
        System.out.println("--------------------------------------------------");  
        Persona p2 = sp.crearPersona();
        Persona p3 = sp.crearPersona();
        Persona p4 = sp.crearPersona();
        
        
    }
    
}
