/*
    Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:

    • Un constructor por defecto.
    • Un constructor con todos los atributos como parámetro.
    • Métodos getters y setters de cada atributo.
    • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
    al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
    O. Si no es correcto se deberá mostrar un mensaje
    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.
    • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    devuelve un booleano.

    A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
 */
package guia2;

import java.util.Scanner;
import util.*;
import exceps.*;

public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private float peso, altura;
    final int CAP_EDAD = 130, CAP_PESO = 600, CAP_ALTURA = 3;

    public Persona() {
        crearPersona();
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) throws CustomException {
        try {
            this.nombre = nombre;
        } catch (Exception exc) {
            throw new CustomException(printErrorParam('n'));
        }
        if (validarEdad(edad)) {
            this.edad = edad;
        } else {
            throw new CustomException(printErrorParam('e'));
        }
        if (validarSexo(sexo)) {
            throw new CustomException(printErrorParam('s'));
        } else {
            this.sexo = sexo;
        }
        if (validarPeso(peso)) {
            throw new CustomException(printErrorParam('p'));
        } else {
            this.peso = peso;
        }
        if (validarAltura(altura)) {
            throw new CustomException(printErrorParam('a'));
        } else {
            this.altura = altura;
        }
    }

    private void crearPersona() {
        setNombre();
        setEdad();
        setSexo();
        setPeso();
        setAltura();
    }

    private void setNombre() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Ingrese NOMBRE:");
            this.nombre = in.nextLine();
            System.out.println(this.nombre);
        } catch (Exception exc) {
            System.out.println(util.printErrorGen());
            setNombre();
        }
    }

    private void setEdad() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Ingrese EDAD:");
            this.edad = in.nextInt();
            if (validarEdad(this.edad)) {
                throw new Exception();
            }
            System.out.println(this.edad);
        } catch (Exception exc) {
            System.out.println(util.printErrorGen());
            setEdad();
        }
    }

    private boolean validarEdad(int edad) {
        return (edad <= 0 || edad > CAP_EDAD);
    }

    private void setSexo() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Ingrese SEXO: ('H' hombre, 'M' mujer, 'O' otro)");
            this.sexo = in.next().toLowerCase().charAt(0);
            if (validarSexo(this.sexo)) {
                throw new Exception();
            }
            System.out.println(this.sexo);
        } catch (Exception exc) {
            System.out.println(util.printErrorGen());
            setSexo();
        }
    }

    private boolean validarSexo(char sexo) {
        return (sexo != 'h' && sexo != 'm' && sexo != 'o');
    }

    private void setPeso() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Ingrese PESO:");
            this.peso = in.nextFloat();
            if (validarPeso(this.peso)) {
                throw new Exception();
            }
        } catch (Exception exc) {
            System.out.println(util.printErrorGen());
            setPeso();
        }
    }

    private boolean validarPeso(float peso) {
        return (peso <= 0 || peso > CAP_PESO);
    }

    private void setAltura() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Ingrese ALTURA:");
            this.altura = in.nextFloat();
            if (validarAltura(this.altura)) {
                throw new Exception();
            }
        } catch (Exception exc) {
            System.out.println(util.printErrorGen());
            setAltura();
        }
    }

    private boolean validarAltura(float altura) {
        return (altura <= 0 || altura > CAP_ALTURA);
    }

    private String printErrorParam(char choice) {
        StringBuilder bob = new StringBuilder();
        bob.append("ERROR: Parámetro ");
        switch (choice) {
            case 'n':
                bob.append("NOMBRE");
                break;
            case 'e':
                bob.append("EDAD");
                break;
            case 's':
                bob.append("SEXO");
                break;
            case 'p':
                bob.append("PESO");
                break;
            case 'a':
                bob.append("ALTURA");
                break;
        }
        bob.append(" inválido, no se puede instanciar el Objeto");

        return bob.toString();
    }

    private String getNombre() {
        return this.nombre;
    }

    private int getEdad() {
        return this.edad;
    }

    private char getSexo() {
        return this.sexo;
    }

    private float getPeso() {
        return this.peso;
    }

    private float getAltura() {
        return this.altura;
    }

    public int calcularIMC() {
        double imc = (this.peso) / (Math.sqrt(this.altura));
        System.out.println("\n" + imc + "\n");
        if (imc < 20) {
            return (-1);
        } else if (imc > 25) {
            return 1;
        }

        return 0;
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18 && this.edad <= CAP_EDAD;
    }
}