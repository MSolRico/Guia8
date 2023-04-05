/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Servicios;

import Ejercicio1.Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class CuentaBancariaServicios {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {
        
        System.out.println("Ingrese numero de cuenta");
        int numeroCuenta = read.nextInt();
        
        System.out.println("Ingrese dni");
        int dniCliente = read.nextInt();
        
        double saldoActual = (Math.random() * (500000000 - 100) + 100);
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    } 

    public CuentaBancaria ingresar(CuentaBancaria c1) {
        
        System.out.println("Dinero que desea ingresar");
        double saldo = (Math.random() * (500000000 - 100) + 100);
        
        System.out.println("Saldo disponible: " + c1.getSaldoActual());
        
        System.out.println("Saldo ingresado: " + saldo);
        
        saldo += c1.getSaldoActual();
        
        c1.setSaldoActual(saldo);
                
        System.out.println("Saldo actualizado " + c1.getSaldoActual());
    }

    public double retirar() {
        return 0;
    }

    public double extraccionRapida() {
        return 0;
    }

    public double consultarSaldo() {
        return 0;
    }

    public void consultarDatos() {

    }
}
