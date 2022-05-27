/*
    Escribir un programa que pida tu nombre, lo guarde en una variable y lo 
    muestre por pantalla.

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
*/
package guia1;

import java.util.Scanner;

public class Ejercicio2 {
    private String nombre;
    public Ejercicio2(){
        System.out.println("Escribir un programa que pida tu nombre, lo guarde en una variable y lo"
                + " muestre por pantalla.\n");
        this.nombre = setNombre();
        System.out.println(getNombre());
    }
    
    private String setNombre(){
        System.out.println("Hola!! Encantado de conocerte :)");
        System.out.println("Cuál es tu nombre??");
        Scanner in = new Scanner(System.in);
        return in.next();
    }
    
    private String getNombre(){
        return "\nTu nombre es: " + this.nombre;
    }
}
