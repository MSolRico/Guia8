/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra1.Servicios;

import EjercicioExtra1.Entidad.Raices;

/**
 *
 * @author SFC
 */
public class RaicesServicios {

    public double getDiscriminante(Raices r1) {
        return Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC());
    }

    public boolean tieneRaices(Raices r1) {

        if (getDiscriminante(r1) > 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean tieneRaiz(Raices r1) {

        if (getDiscriminante(r1) == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void obtenerRaices(Raices r1) {

        double x1 = 0, x2 = 0;
        x1 = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA());
        x2 = (-r1.getB() - Math.sqrt(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA());
        System.out.println(x1);
        System.out.println(x2);

    }

    public void obtenerRaiz(Raices r1) {

        double x1 = 0;
        x1 = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA());
        System.out.println(x1);

    }

    public void calcular(Raices r1) {
        if (tieneRaices(r1) == true) {
            obtenerRaices(r1);
        } else if (tieneRaiz(r1) == true) {
            obtenerRaiz(r1);
        } else {
            System.out.println("No existe solución");
        }
    }
}
