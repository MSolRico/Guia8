/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra1;

import EjercicioExtra1.Entidad.Raices;
import EjercicioExtra1.Servicios.RaicesServicios;

/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Raices r1 = new Raices(-2, -4, -10);
//        Raices r1 = new Raices(-2, -8, 10);
//        Raices r1 = new Raices(-4, 12,-9);
        RaicesServicios rs = new RaicesServicios();
        rs.calcular(r1);

    }
}
