/*
    Escribir un programa que pida dos números enteros por teclado y calcule la suma
    de los dos. El programa deberá después mostrar el resultado de la suma.

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
*/
package guia1;

import java.util.Scanner;
import util.*;

public class Ejercicio1 {
    private int i, j;
    public Ejercicio1(){
        System.out.println("En este ejercicio vamos a escribir un programa que\n"
                + "pida dos números enteros por teclado y calcule la \n"
                + "suma de los dos. El programa deberá después mostrar\n"
                + "el resultado de la suma.");
        System.out.println();
        setValues();
        System.out.println("\n" + getEcuacion() + calcularSuma());
    }
    
    private void setValues(){
        try{
            Scanner in = new Scanner(System.in);
            if(this.i==0){
                System.out.println("Ingrese el primer número ENTERO:");
                this.i = in.nextInt();
            }
            if(this.j==0){
                System.out.println("Ingrese el segundo número ENTERO:");
                this.j = in.nextInt();
            }
        }
        catch (Exception exc){
            System.out.println(util.printErrorEnteros());
            setValues();
        }
    }
    
    private String getEcuacion(){
        StringBuilder bob = new StringBuilder();
        if(this.i < 0){
            bob.append("(" + this.i + ") + ");
        }
        else{
            bob.append(this.i + " + ");
        }
        if(this.j < 0){
            bob.append("(" + this.j + ") = ");
        }
        else{
            bob.append(this.j + " = ");
        }
        return bob.toString();
    }
    
    private int calcularSuma(){
        return this.i + this.j;
    }
}
