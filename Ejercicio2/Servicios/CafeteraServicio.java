/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.Servicios;

import Ejercicio2.Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class CafeteraServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public int llenarCafetera(Cafetera c1) {
        c1.capacidadActual = c1.getCapacidadMaxima();
        System.out.println("Capacidad Actual: " + c1.getCapacidadActual() + " ml.");
        return c1.capacidadActual;
    }

    public int servirTaza(Cafetera c1) {

        System.out.println("Ingrese el tamaño de la taza");
        int taza = read.nextInt();

        if (taza > c1.getCapacidadActual() && c1.getCapacidadActual() != 0) {
            System.out.println("Cantidad disponible: " + c1.capacidadActual + "\nSirviendo...\nTenga un buen día");
            c1.setCapacidadActual(0);
            return c1.getCapacidadActual();
        } else if (c1.getCapacidadActual() == 0){
            System.out.println("Disculpe, la cafetera se encuentra vacia");
            return c1.getCapacidadActual();
        } else {
            System.out.println("Sirviendo...\nSu taza esta llena, disfrute :)");
            c1.setCapacidadActual(c1.getCapacidadActual() - taza);
            return c1.getCapacidadActual();
        }
    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCapacidadActual(0);
        System.out.println("Cantidad disponible: " + c1.getCapacidadActual() + " ml.");
    }

    public int agregarCafe(Cafetera c1) {

        System.out.println("Cantidad de cafe que desea agregar");
        int cafe = read.nextInt();

        if (c1.getCapacidadActual() + cafe > 1000) {
            System.out.println("Llenando cafetera\nCantidad disponible: 1000 ml.");
            c1.setCapacidadActual(1000);
            return c1.getCapacidadActual();
        } else {
            c1.setCapacidadActual(c1.getCapacidadActual() + cafe);
            System.out.println("Cantidad disponible en cafetera: " + c1.getCapacidadActual() + " ml.");
            return c1.getCapacidadActual();
        }
    }

}
