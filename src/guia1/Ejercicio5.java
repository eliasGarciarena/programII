/*
    Escribir un programa que lea un número entero por teclado y muestre por pantalla
    el doble, el triple y la raíz cuadrada de ese número.
 */
package guia1;

public class Ejercicio5 {
    Ejercicio5(){
        System.out.println("Escribir un programa que lea un número entero por teclado y muestre por pantalla\n" +
        "el doble, el triple y la raíz cuadrada de ese número.\n");
        setInt();
    }
    
    private void setInt(){
        try{
            System.out.println("Ingrese un número ENTERO:");
        }
        catch(Exception exc){
            System.out.println("¡Sólo se admiten números enteros!");
        }
    }
}
