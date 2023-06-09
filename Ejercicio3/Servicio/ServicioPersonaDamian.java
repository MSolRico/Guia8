package Ejercicio3.Servicio;

import Ejercicio3.Entidades.PersonaDamian;
import java.util.Scanner;

public class ServicioPersonaDamian {

    //Atributos 
    Scanner entry = new Scanner(System.in).useDelimiter("\n");

    //---------- Metodos -------------
    //Metodo A
    public boolean esMayorDeEdad(PersonaDamian persona) {
        return persona.getEdad() >= 18;
    }

    //Metodo B
    public PersonaDamian crearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = entry.nextLine();
        System.out.println("Ingrese su edad");
        int edad = entry.nextInt();
        
        String genero;
        do {
            System.out.println("Ingrese su sexo: M (masculino), F (femenino) u O (otro)");
            genero = entry.next().toUpperCase();
            genero = String.valueOf(genero.charAt(0));
            if (!genero.equals("M") && !genero.equals("F")&& !genero.equals("O")) {
                System.out.println("Ha ingresado una opcion incorrecta, vuelva a intentar");
            }
            
        } while (!genero.equals("M") && !genero.equals("F")&& !genero.equals("O"));

        System.out.println("Ingrese su peso en kg");
        double peso = entry.nextDouble();
        System.out.println("Ingrese su altura en metros");
        double altura = entry.nextDouble();
        return new PersonaDamian(nombre, edad, genero.charAt(0), peso, altura);
    }

    //Metodo C
    public int calcularIMC(PersonaDamian persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    //Metodos auxiliares
    public int mayoriaDeEdad(PersonaDamian persona) {
        if (persona.getEdad() >= 18) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public String porcentajeImcPesonas(PersonaDamian persona) {        
        String peso;
        switch (calcularIMC(persona)) {
            case -1:
                peso = "bajopeso";
                break;
            case 0:
                peso = "peso ideal";
                break;
            default:
                peso = "sobrepeso";
                break;
        }
        return peso;
    }


}
