/*
    Métodos repetitivos

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
 */
package util;

import java.util.Scanner;
import exceps.*;

public class util {

    public static int run(char choice, int cap) throws CustomException {
        int decision = 0;
        if (choice == 'g') {
            System.out.println("Ingrese nro. de guia que desea ejecutar: (1 - " + cap + ")");
        } else if (choice == 'e') {
            System.out.println("Ingrese nro. de ejercicio que desea ejecutar: (1 - " + cap + ")");
        } else {
            throw new CustomException("CRITICAL ERROR: Parametros invalidos (util.run)");
        }
        Scanner in = new Scanner(System.in);
        decision = in.nextInt();
        System.out.println();
        if (decision <= 0 || decision > cap) {
            System.out.println("¡Elija una opción válida! (1 - " + cap + ")\n");
            throw new CustomException();
        }

        return decision;
    }

    public static String cargar(char choice) {
        StringBuilder bob = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            if (i == 49) {
                switch (choice) {
                    case 'p':
                        bob.append("\n100%. Procesado\n\n");
                        break;
                    case 'r':
                        bob.append("\nReiniciando\n\n");
                        break;
                }
            } else if (i == 0) {
                bob.append("\n*");
            } else {
                bob.append("*");
            }
        }
        return bob.toString();
    }

    public static void printLobby(int guia) {
        System.out.println("-----------------------");
        System.out.println("GUIA DE EJERCICIOS N°" + guia);
        System.out.println("-----------------------\n");
    }

    public static String printErrorEnteros() {
        return "\n¡Sólo se permiten números enteros!\n";
    }
    
    public static String printErrorGen(){
        return "\nError! Debe ingresar una opción válida\n";
    }

    public static String imprimirMatriz(Object matriz[][]) {
        StringBuilder bob = new StringBuilder();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == matriz[i].length - 1) {
                    if(Integer.parseInt(matriz[i][j].toString())>=0 && Integer.parseInt(matriz[i][j].toString())<10){
                        bob.append(matriz[i][j] + " ");
                        bob.append("\n");
                    }
                    else{
                        bob.append(matriz[i][j]);
                        bob.append("\n");
                    }
                } else {
                    if(Integer.parseInt(matriz[i][j].toString())>=0 && Integer.parseInt(matriz[i][j].toString())<10){
                        bob.append(matriz[i][j] + " ");
                        bob.append(" ");
                    }
                    else{
                        bob.append(matriz[i][j]);
                        bob.append(" ");
                    }
                }
            }
        }

        return bob.toString();
    }
}
