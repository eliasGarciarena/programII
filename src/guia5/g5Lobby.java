/*
    Lobby de la Guía 2

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
 */
package guia5;

import guia5.ej2.*;
import guia5.ej4.*;
import util.*;
import exceps.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class g5Lobby {

    final int cantEj = 4;

    public g5Lobby() throws CustomException {
        util.printLobby(5);
        procesaEj();
    }

    private void procesaEj() {
        try {
            switch (util.run('e', this.cantEj)) {
                case 2:
                    g5Ejercicio2();
                    break;
                case 3:
                    g5Ejercicio3();
                    break;
                case 4:
                    g5Ejercicio4();
                    break;
            }
        } catch (Exception exc) {
            System.out.println(util.printErrorGen());
            System.out.println(exc.toString() + "\n");
            procesaEj();
        }
    }

    private void g5Ejercicio2(){
        System.out.println("Crear una superclase llamada Electrodoméstico con los siguientes atributos:\n" +
"precio, color, consumo energético (letras entre A y F) y peso.\n" +
"\n" +
"A continuación, se debe crear una subclase llamada Lavadora, con el atributo\n" +
"carga, además de los atributos heredados.\n" +
"\n" +
"Se debe crear también una subclase llamada Televisor con los siguientes\n" +
"atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los\n" +
"atributos heredados.\n" +
"\n" +
"Finalmente, en el main debemos realizar lo siguiente:\n" +
"Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios\n" +
"para mostrar el precio final de los dos electrodomésticos.");

        //Electrodomestico
        System.out.println("\nElectrodomestico creado!\n");
        Electrodomestico electro = new Electrodomestico();
        electro.precioFinal();
        System.out.println(electro.toString());
        
        //Lavadora
        System.out.println("\nLavadora creada!\n");
        Lavadora lav = new Lavadora();
        lav.precioFinal();
        System.out.println(lav.toString());
        
        //Televisor
        System.out.println("\nTelevisor creado!\n");
        Televisor tele = new Televisor();
        tele.precioFinal();
        System.out.println(tele.toString());
    }
    
    private void g5Ejercicio3(){
        System.out.println("Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de\n" +
"Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o\n" +
"televisores, con valores ya asignados.\n" +
"Luego, recorrer este array y ejecutar el método precioFinal() en cada\n" +
"electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,\n" +
"es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho\n" +
"eso, también deberemos mostrar, la suma del precio de todos los\n" +
"Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000\n" +
"y un televisor de 5000, el resultado final será de 7000 (2000+5000) para\n" +
"electrodomésticos, 2000 para lavadora y 5000 para televisor.");
        
        List<Electrodomestico> arrayL = new ArrayList();
        double cont = 0;
        
        Lavadora lav1 = new Lavadora(10, 1000d, 100d, "blanco", "a");
        Lavadora lav2 = new Lavadora(40, 1000d, 100d, "negro", "b");
        Televisor tele1 = new Televisor(20, true, 1000d, 100d, "negro", "b");
        Televisor tele2 = new Televisor(50, false, 1000d, 100d, "negro", "b");
        
        arrayL.add(lav1);
        arrayL.add(lav2);
        arrayL.add(tele1);
        arrayL.add(tele2);
        
        for(Electrodomestico electro: arrayL){
            electro.precioFinal();
            cont += electro.getPrecio();
            System.out.println(electro.toString());
        }
        
        System.out.println("\nLa SUMATORIA total de PRECIOS es = " + cont);
        
    }
    
    private void g5Ejercicio4(){
        System.out.println("Se plantea desarrollar un programa que nos permita calcular el área y el perímetro\n" +
"de formas geométricas, en este caso un circulo y un rectángulo. Ya que este\n" +
"calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,\n" +
"llamada calculosFormas que tendrá, los dos métodos para calcular el área, el\n" +
"perímetro y el valor de PI como constante.\n" +
"\n" +
"Desarrollar el ejercicio para que las formas implementen los métodos de la\n" +
"interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las\n" +
"formas y se mostrará el resultado final.\n" +
"\n" +
"Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.\n" +
"Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2");
        
        System.out.println("\n- Circulo creado!");
        Circulo circulo1 = new Circulo();
        System.out.println("\nEl AREA del Circulo es = " + circulo1.calcularArea()/Math.PI + " π (≈ " + circulo1.calcularArea() + ")");
        System.out.println("El PERIMETRO del Circulo es = " + circulo1.calcularPerimetro()/Math.PI + " π (≈ " + circulo1.calcularPerimetro() + ")");

        System.out.println("\n- Rectangulo creado!");
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("\nEl AREA del Rectangulo es = " + rectangulo1.calcularArea());
        System.out.println("El PERIMETRO del Rectangulo es = " + rectangulo1.calcularPerimetro());
    }
}