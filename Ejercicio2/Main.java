/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Ejercicio2.Entidades.Cafetera;
import Ejercicio2.Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c1 = new Cafetera();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       int opc;
        do {
            System.out.println("Desea\n1)Llenar la cafetera\n2)Servirse cafe\n3)Vaciar cafetera\n4)Hacer mas cafe\n5)Salir");
            opc = leer.nextInt();
        switch (opc){
            case 1:
                cs.llenarCafetera(c1);
                break;
            case 2:
                 cs.servirTaza(c1);
                 break;
            case 3:
                cs.vaciarCafetera(c1);
                break;
            case 4:
                cs.agregarCafe(c1);
                break;
        }
        } while (opc<=4);
       
        
    }
    
}
