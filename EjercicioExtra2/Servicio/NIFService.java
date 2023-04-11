/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2.Servicio;

import EjercicioExtra2.Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class NIFService {
    
    Scanner read = new Scanner(System.in);
    
    public NIF crearNif(){
        System.out.println("Ingrese su numero de DNI");
        int dni = read.nextInt();
        String letra = "a";
        String[] vector = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        return new NIF(dni, letra, vector);
    }
    
    public String Nif(NIF n1){
        int aux = n1.getDni() % 23;
        n1.setLetra(n1.getVector(aux));
        return n1.getLetra();
    }
    
    public void mostrar(NIF n1){
        int lon = String.valueOf(n1.getDni()).length();
        Nif(n1);
        if (lon == 8) {
            System.out.println(n1.getDni() + "-" + n1.getLetra());
        } else System.out.println("0" + n1.getDni() + "-" + n1.getLetra());
    }
    
   
}
