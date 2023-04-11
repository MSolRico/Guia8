package Ejercicio3;

import Ejercicio3.Entidades.PersonaDamian;
import Ejercicio3.Servicio.ServicioPersonaDamian;

public class Ejercicio3Damian {

    public static void main(String[] args) {
        ServicioPersonaDamian sp = new ServicioPersonaDamian();
//        Persona persona1 = sp.crearPersona();
        PersonaDamian persona1 = new PersonaDamian("Pepe", 50, "M".charAt(0), 30, 1.65);
        PersonaDamian persona2 = new PersonaDamian("Pepa", 25, "F".charAt(0), 70, 1.55);
        PersonaDamian persona3 = new PersonaDamian("Montoto", 40, "M".charAt(0), 100, 1.80);
        PersonaDamian persona4 = new PersonaDamian("Montota", 65, "F".charAt(0), 60, 1.60);
//        System.out.println(examinarPersona(persona1));
//        System.out.println(examinarPersona(persona2));
//        System.out.println(examinarPersona(persona3));
//        System.out.println(examinarPersona(persona4));        
        int porcentajeEdad[] = {
                    sp.mayoriaDeEdad(persona1),
                    sp.mayoriaDeEdad(persona2),
                    sp.mayoriaDeEdad(persona3),
                    sp.mayoriaDeEdad(persona4)
                };

        String porcentajeIMC[] = {
            sp.porcentajeImcPesonas(persona1),
            sp.porcentajeImcPesonas(persona2),
            sp.porcentajeImcPesonas(persona3),
            sp.porcentajeImcPesonas(persona4),};
        
        calcularPorcentajeEdades(porcentajeEdad);
        calcularPorcentajeIMC(porcentajeIMC);

    }

    public static void calcularPorcentajeEdades(int arreglo[]) {
        int mayores = 0, menores = 0;
        for (int i = 0; i < 4; i++) {
            if (arreglo[i] == 1) {
                mayores += 25;
            } else {
                menores += 25;
            }
        }
        System.out.println("La cantidad de personas mayores es del: " + mayores + " %");
        System.out.println("La cantidad de personas menores es del: " + menores + " %");
    }

    public static void calcularPorcentajeIMC(String arreglo[]) {
        int bajopeso = 0, normal = 0, sobrepeso = 0;
        for (int i = 0; i < 4; i++) {
            if (arreglo[i].equalsIgnoreCase("bajopeso")) {
                bajopeso += 25;
            } else if (arreglo[i].equalsIgnoreCase("peso ideal")) {
                normal += 25;
            } else {
                sobrepeso += 25;
            }
        }
        System.out.println("La cantidad de personas con bajopeso es del: " + bajopeso + " %");
        System.out.println("La cantidad de personas con peso ideal es del: " + normal + " %");
        System.out.println("La cantidad de personas con sobrepesp es del: " + sobrepeso + " %");
    }

    public static String examinarPersona(PersonaDamian persona) {
        ServicioPersonaDamian sp = new ServicioPersonaDamian();
        String mayoria, peso;
        if (persona.getEdad() >= 18) {
            mayoria = "es mayor de edad";
        } else {
            mayoria = "es menor de edad";
        }
        switch (sp.calcularIMC(persona)) {
            case -1:
                peso = "posee bajopeso";
                break;
            case 0:
                peso = "posee peso ideal";
                break;
            default:
                peso = "Posee sobrepeso";
                break;
        }
        return persona.getNombre() + " " + mayoria + " y " + peso;
    }

}
