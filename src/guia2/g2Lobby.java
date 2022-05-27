/*
    Lobby de la Guía 2

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
 */
package guia2;

import util.*;
import exceps.*;

public class g2Lobby {

    final int cantEj = 7;

    public g2Lobby() throws CustomException {
        util.printLobby(2);
        procesaEj();
    }

    private void procesaEj() {
        try {
            switch (util.run('e', this.cantEj)) {
                case 1:
                    g2Ejercicio1();
                    break;
                case 7:
                    g2Ejercicio7();
                    break;
            }
        } catch (Exception exc) {
            System.out.println(exc.toString());
            procesaEj();
        }
    }

    private void g2Ejercicio1() {
        System.out.println("Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,\n"
                + "Autor, Número de páginas, y un constructor con todos los atributos pasados por\n"
                + "parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los\n"
                + "datos al usuario y luego informar mediante otro método el número de ISBN, el título,\n"
                + "el autor del libro y el numero de páginas.\n\n");

        System.out.println("Libro CONSTRUCTOR DEFAULT");
        System.out.println("-------------------------\n");
        Libro libroConstructorDefault = new Libro();

        System.out.println("\nLibro CONSTRUCTOR PARAMETRIZADO");
        System.out.println("-------------------------------");
        Libro libroParam = new Libro("test", "programadorDefault", 500, 1000000000000L);
    }

    private void g2Ejercicio7() {
        System.out.println("Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,\n"
                + "sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún\n"
                + "otro atributo, puede hacerlo.\n\nLos métodos que se implementarán son:\n\n"
                + "    • Un constructor por defecto.\n"
                + "    • Un constructor con todos los atributos como parámetro.\n"
                + "    • Métodos getters y setters de cada atributo.\n"
                + "    • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos\n"
                + "    al usuario y después se le asignan a sus respectivos atributos para llenar el objeto\n"
                + "    Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M u\n"
                + "    O. Si no es correcto se deberá mostrar un mensaje\n"
                + "    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en\n"
                + "    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa\n"
                + "    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la\n"
                + "    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona\n"
                + "    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la\n"
                + "    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la\n"
                + "    función devuelve un 1.\n"
                + "    • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función\n"
                + "    devuelve un booleano.\n"
                + "\n"
                + "A continuación, en la clase main hacer lo siguiente:\n\n"
                + "Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos\n"
                + "los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,\n"
                + "tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la\n"
                + "persona es mayor de edad.\n"
                + "Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad\n"
                + "en distintas variables, para después en el main, calcular un porcentaje de esas 4\n"
                + "personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por\n"
                + "encima, y también calcularemos un porcentaje de cuantos son mayores de edad y\n"
                + "cuantos menores.\n");
        
        Persona p1 = new Persona();
    }
}
