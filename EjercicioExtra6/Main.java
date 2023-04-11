/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra6;

import EjercicioExtra6.Entidades.Ascensor;
import EjercicioExtra6.Service.AscensorService;
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
        Scanner leer = new Scanner(System.in);
        AscensorService prueba = new AscensorService();
        Ascensor p1 = prueba.crearAscensor();
        int op;
        do {
            
            System.out.println("Menú");
            System.out.println("1.Subir");
            System.out.println("2.Bajar");
            System.out.println("3.Ir a");
            System.out.println("4.Cerrar puerta");
            op =leer.nextInt();
          switch (op) {
            case 1:
                prueba.subir(p1);
                break;
            case 2:
                prueba.bajar(p1);
                break;
            case 3:                                
                prueba.irA(p1);
                break;
            case 4:
                System.out.println("Gracias por usar el ascensor");
                break;
            default:
                System.out.println("opcion incorrecta");;
        }  
        } while (op!=4);
    }
}