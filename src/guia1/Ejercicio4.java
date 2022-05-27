/*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en
    grados Fahrenheit.

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
*/
package guia1;

import java.util.Scanner;

public class Ejercicio4{
    private int celcius;
    public Ejercicio4(){
        System.out.println("Dada una cantidad de grados centígrados se debe mostrar su equivalente en\n" +
        "grados Fahrenheit.\n\n");
        setCelcius();
        System.out.println("\n" + this.celcius + "°C = " + convertir() + "°F");
    }
    
    private void setCelcius(){
        try{
            System.out.println("Ingrese grados CELCIUS (°C) para la conversión:");
            Scanner in = new Scanner(System.in);
            this.celcius = in.nextInt();
        }
        catch (Exception exc){
            System.out.println("\n¡Sólo se admiten números enteros!\n");
            setCelcius();
        }
    }
    
    private int convertir(){
        return 32 + (9 * this.celcius / 5);
    }
    
}