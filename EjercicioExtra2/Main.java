/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2;

import EjercicioExtra2.Entidades.NIF;
import EjercicioExtra2.Servicio.NIFService;


/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFService ns = new NIFService();
        NIF n1 = ns.crearNif();
        ns.mostrar(n1);
        
    }
    
}
