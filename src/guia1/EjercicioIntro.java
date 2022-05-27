/*
    Programa introductorio a Java (de prueba)

    Crea una matriz de tamaño variable (ingresada por teclado) con enteros generados aleatoriamente.

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
*/
package guia1;

import java.util.Scanner;

public class EjercicioIntro{
    private int m, n;
    private int[][] matrix;
    
    public EjercicioIntro(){        
        System.out.println("\nPrograma introductorio a Java (de prueba)\n");
        System.out.println("Crea una matriz de tamaño variable (ingresada por teclado) con enteros generados aleatoriamente.\n");
        setDimensiones();
        buildMatrix(m, n);
        llenarMatrix();
        System.out.println("\n");
        mostrarMatrix();
    }
    
    private void setDimensiones(){
        try{
            Scanner in = new Scanner(System.in);
            if(this.m == 0){
            System.out.println("Ingrese cantidad de FILAS:");
            this.m = in.nextInt();
            }
            if(this.n == 0){
            System.out.println("Ingrese cantidad de COLUMNAS:");
            this.n = in.nextInt();
            }
        }
        catch (Exception ex){
            System.out.println("\n¡Sólo se admiten números enteros!\n");
            setDimensiones();
        }
    }
 
    private void buildMatrix(int m, int n){
        this.matrix = new int[m][n];
    }
    
    private void llenarMatrix(){

        for(int i=0;i<this.m;i++){
            for(int j=0;j<this.n;j++){
                this.matrix[i][j] = (int) Math.floor(Math.random()*10);
            }
        }

    }

    private void mostrarMatrix(){

        for(int i=0;i<this.m;i++){
            for(int j=0;j<this.n;j++){
                if(j==this.n-1){
                    System.out.println(this.matrix[i][j]);
                }
                else{
                    System.out.print(this.matrix[i][j]);
                }
            }
        }

    }
}