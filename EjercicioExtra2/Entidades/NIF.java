/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2.Entidades;

/**
 *
 * @author SFC
 */
public class NIF {
    
    public int dni;
    public String letra;
    public String[] vector = new String[22];

    public NIF() {
    }

    public NIF(int dni, String letra, String[] vector) {
        this.dni = dni;
        this.letra = letra;
        this.vector = vector;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getVector(int aux) {
        return vector[aux];
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

}
