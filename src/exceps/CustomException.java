/*
    Lanzar una excepcion genérica con (o sin) un mensaje custom

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
*/
package exceps;

public class CustomException extends Exception{
    public CustomException(){
        super("\nERROR: La información introducida no es válida.\n");
    }
    
    public CustomException(String msg){
        super(msg);
    }
}