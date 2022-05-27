/*
    Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
    P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
    contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
    submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
    columnas, existe al menos una que coincida con la matriz P. En ese caso, el
    programa debe indicar la fila y la columna de la matriz M en la cual empieza el
    primer elemento de la submatriz P.
 */
package guia1;

import java.util.Scanner;
import util.*;
import exceps.*;

public class Ejercicio26 {

    private int n, m;
    private Integer matrizP[][] = {
        {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
        {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
        {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
        {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
        {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
        {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
        {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}
    };
    //private Integer matrizP[][] = new Integer[10][10];
    private Integer matrizQ[][] = new Integer[3][3];

    public Ejercicio26() {
        System.out.println("Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz\n"
                + "P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está\n"
                + "contenida dentro de la matriz M. Para ello se debe verificar si entre todas las\n"
                + "submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o\n"
                + "columnas, existe al menos una que coincida con la matriz P. En ese caso, el\n"
                + "programa debe indicar la fila y la columna de la matriz M en la cual empieza el\n"
                + "primer elemento de la submatriz P.\n\n");
        //inicializarMatriz(matrizP);
        inicializarMatriz(matrizQ);
        System.out.print("\n\n" + util.imprimirMatriz(matrizP));
        System.out.println("\n\n" + util.imprimirMatriz(matrizQ));
        calcularMatch(matrizP, matrizQ);
    }

    private void inicializarMatriz(Integer matriz[][]) {
        String choice;
        System.out.println("Escoja cómo quiere llenar la MATRIZ de " + matriz.length + " FILAS y " + matriz[0].length + " COLUMNAS");
        Scanner in = new Scanner(System.in);
        try {
            choice = in.next();
            if (choice.toLowerCase().equals("a")) {
                llenarMatrizAuto(matriz);
            } else if (choice.toLowerCase().equals("m")) {
                llenarMatrizManual(matriz);
            } else {
                throw new Exception();
            }
        } catch (Exception exc) {
            System.out.println("Opción ingresada incorrecta!\n");
            inicializarMatriz(matriz);
        }
    }

    private void llenarMatrizAuto(Integer matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * 10);
            }
        }
    }

    private void llenarMatrizManual(Integer matriz[][]) {
        Scanner in = new Scanner(System.in);
        try {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = in.nextInt();
                }
            }
        } catch (Exception exc) {
            System.out.println(util.printErrorEnteros());
            llenarMatrizManual(matriz);
        }
    }

    private void calcularMatch(Object matrizP[][], Object matrizQ[][]) {
        int cont;
        boolean contains = false;

        bloque:
        {
            for (int i = 0; i < matrizQ.length; i++) {
                for (int j = 0; j < matrizQ[i].length; j++) {
                    //buscar esta matriz dentro de la siguiente
                    for (int k = 0; k < matrizP.length; k++) {
                        for (int n = 0; n < matrizP[k].length; n++) {
                            //si posicion actual coincide con [0] de la original:
                            buscar:
                            {
                                if (matrizQ[i][j].equals(matrizP[k][n])) {
                                    cont = 0;
                                    for (int l = 0; l < matrizQ.length; l++) {
                                        for (int m = 0; m < matrizQ[l].length; m++) {
                                            if (matrizQ[l][m].equals(matrizP[k + l][n + m])) {
                                                cont++;
                                            } else {
                                                break buscar;
                                            }
                                        }
                                    }

                                    if (cont == getMatrixSize(matrizQ)) {
                                        contains = true;
                                        System.out.println(contains + " en la posicion (" + (k + 1) + ", " + (n + 1) + ")");
                                        break bloque;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println(contains + " :(");
        }
    }

    private int getMatrixSize(Object matrix[][]) {
        int cont = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                cont++;
            }
        }

        return cont;
    }

}
