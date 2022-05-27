/*
    Programa Final para ejecutar los ejercicios de cada guía del curso

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
 */
import java.util.Scanner;
import guia1.*;
import guia2.*;
import guia5.*;
import util.*;
import exceps.*;

class Main {

    final static int NROGUIAS = 5;
    static int decision;
    static String salida;

    public static void main(String[] args) throws CustomException {
        System.out.println("\n----------------------");
        System.out.println("PROGRAMACION II - JAVA");
        System.out.println("----------------------\n");
        pos();
        System.out.println("\nDesea continuar la ejecución? : (Y/N)");
        Scanner in1 = new Scanner(System.in);
        salida = in1.next();
        if (salida.toLowerCase().equals("n")) {
            System.out.println("\nEjecución finalizada. Hasta luego!");
        } else {
            main(null);
        }
    }

    private static void pos() throws CustomException {
        try {
            switch (util.run('g', NROGUIAS)) {
                case 1:
                    g1Lobby g1Lobby = new g1Lobby();
                    break;
                case 2:
                    g2Lobby g2Lobby = new g2Lobby();
                    break;
                case 5:
                    g5Lobby g5Lobby = new g5Lobby();
                    break;
            }
        } catch (Exception exc) {
            pos();
        }
    }
}
