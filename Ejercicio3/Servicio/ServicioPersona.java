/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.Servicio;

import Ejercicio3.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class ServicioPersona {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese nombre");
        String nombre = read.next();
        System.out.println("Ingrese edad");
        int edad = read.nextInt();
        String sexo;
        do {
            System.out.println("Ingrese sexo (H,M o O)");
            sexo = read.next();
        } while (sexo.equalsIgnoreCase("M") && sexo.equalsIgnoreCase("H") && sexo.equalsIgnoreCase("O"));
        System.out.println("Ingrese peso en kg");
        double peso = read.nextDouble();
        System.out.println("Ingrese altura en cm");
        double altura = (read.nextDouble() / 100);
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public boolean esMayorDeEdad(Persona p1) {
        return p1.getEdad() >= 18;
    }

    public int calcularIMC(Persona p1) {
        double IMC = p1.getPeso() / (Math.pow(p1.getAltura(), 2));
        if (IMC < 20) {
            System.out.println("Se encuentra debajo del peso ideal");
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            System.out.println("Se encuentra en su peso ideal");
            return 0;
        } else {
            System.out.println("Se encuentra por encima de su peso ideal");
            return 1;
        }
    }

    public void porcentajeIMC(int[] imc) {

        int aux0 = 0, aux1 = 0, aux2 = 0;

        for (int i = 0; i < 4; i++) {
            switch (imc[i]) {
                case -1:
                    aux2 += 25;
                    break;
                case 0:
                    aux0 += 25;
                    break;
                case 1:
                    aux1 += 25;
                    break;
            }
        }

        System.out.println("Porcentaje de personas por debajo del peso ideal: " + aux2 + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + aux0 + "%");
        System.out.println("Porcentaje de personas por encima del peso ideal: " + aux1 + "%");

    }

    public void porcentajeMayor(boolean[] mayor) {

        int mas = 0;
        for (int i = 0; i < 4; i++) {
            if (mayor.equals(true)) {
                mas += 25;
        }
        }

        System.out.println("Porcentaje mayores de edad: " + mas + "%");
        System.out.println("Porcentaje mayores de edad: " + (100 - mas) + "%");

    }
}
