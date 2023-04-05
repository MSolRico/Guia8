package Ejercicio3.Entidades;

public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private Character genero;
    private double peso;
    private double altura;

    //Constructores
    public Persona() {
    }

    public Persona(String nombre, int edad, Character sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
