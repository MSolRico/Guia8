/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Ejercicio1.Entidades.CuentaBancaria;
import Ejercicio1.Servicios.CuentaBancariaServicios;

/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicios cbs1 = new CuentaBancariaServicios();
        CuentaBancaria c1 = cbs1.crearCuenta();
        System.out.println(c1);
        
    }
    
}
