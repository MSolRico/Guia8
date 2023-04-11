/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Ejercicio1.Entidades.CuentaBancaria;
import Ejercicio1.Servicios.CuentaBancariaServicios;
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
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        CuentaBancariaServicios cbs1 = new CuentaBancariaServicios();
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("Desea: 1)Crear una cuenta\n2)Ingresar dinero\n3)Retirar dinero\n4)Hacer una extracción rápida\n5)Consultar su saldo\n6)Consultar los datos de la cuenta");
        int opcion = 0;
        switch (opcion){
            case 1:
                cbs1.crearCuenta(c1);
                System.out.println(c1);
            case 2:
                cbs1.ingresar(c1);
                System.out.println(c1);
            case 3:
                cbs1.retirar(c1);
                System.out.println(c1);
            case 4:
                cbs1.extraccionRapida(c1);
                System.out.println(c1);
            case 5:
                cbs1.consultarSaldo(c1);
                System.out.println(c1);
            case 6:
                cbs1.consultarDatos(c1);
                System.out.println(c1);
        }

        
        
    }
    
}
