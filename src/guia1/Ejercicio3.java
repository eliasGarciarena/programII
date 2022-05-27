/*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y
    después toda en minúsculas.

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
*/
package guia1;

import java.util.Scanner;

public class Ejercicio3 {
    private String frase;
    
    public Ejercicio3(){
        System.out.println("Escribir un programa que pida una frase y la muestre toda en mayúsculas y\n" +
"después toda en minúsculas.");
        setFrase();
        System.out.println("\n------");
        System.out.println("OUTPUT");
        System.out.println("------");
        System.out.println("\nminusculas: " + this.frase.toLowerCase());
        System.out.println("\nMAYUSCULAS: " + this.frase.toUpperCase());
    }
    
    private void setFrase(){
        System.out.println("\nPor favor, digite su entrada:");
        Scanner in = new Scanner(System.in);
        this.frase = in.next();
    }
}