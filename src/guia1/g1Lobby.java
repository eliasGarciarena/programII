/*
    Lobby de la Guía 1

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
 */
package guia1;

import util.*;
import exceps.*;

public class g1Lobby {

    final private int cantEj = 27;

    public g1Lobby() throws CustomException {
        util.printLobby(1);
        procesaEj();
    }

    private void procesaEj() {
        try {
            switch (util.run('e', this.cantEj)) {
                case 1:
                    g1Ejercicio1();
                    break;
                case 2:
                    g1Ejercicio2();
                    break;
                case 3:
                    g1Ejercicio3();
                    break;
                case 4:
                    g1Ejercicio4();
                    break;
                case 26:
                    g1Ejercicio26();
                    break;
                case 27:
                    g1EjercicioIntro();
                    break;
            }
        } catch (Exception exc) {
            System.out.println(exc.toString());
            procesaEj();
        }
    }

    private void g1EjercicioIntro() {
        EjercicioIntro ejercicioIntro = new EjercicioIntro();
    }

    private void g1Ejercicio1() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
    }

    private void g1Ejercicio2() {
        Ejercicio2 ejercicio2 = new Ejercicio2();
    }

    private void g1Ejercicio3() {
        Ejercicio3 ejercicio3 = new Ejercicio3();
    }

    private void g1Ejercicio4() {
        Ejercicio4 ejercicio4 = new Ejercicio4();
    }

    private void g1Ejercicio26() {
        Ejercicio26 ejercicio26 = new Ejercicio26();
    }
}
