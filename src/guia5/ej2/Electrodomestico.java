/*
    Ejercicio 2 Guia 5
 */
package guia5.ej2;

import java.util.*;

public class Electrodomestico{

    protected Double precio, peso;
    protected String color;
    protected Character consumo;

    public Electrodomestico(Double precio, Double peso, String color, String consumo) {
        crearElectrodomestico(precio, peso, color, consumo);
    }

    public Electrodomestico() {
        crearElectrodomestico();
    }

    public Double getPrecio() {
        return precio;
    }

    public Double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumo() {
        return consumo;
    }

    protected void setPrecio(Double precio) {
        this.precio = precio;
    }

    protected void setPeso(Double peso) {
        this.peso = peso;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    private void comprobarConsumoEnergetico(char letra) {
        switch (letra) {
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            case 'E':
                break;
            case 'F':
                break;
            default:
                this.setConsumo('F');
                break;
        }
    }

    private void comprobarColor(String color) {
        switch (color) {
            case "BLANCO":
                break;
            case "NEGRO":
                break;
            case "ROJO":
                break;
            case "AZUL":
                break;
            case "GRIS":
                break;
            default:
                this.setColor("BLANCO");
                break;
        }
    }

    protected void crearElectrodomestico() {
        setElectrodom();
        comprobarColor(this.color);
        comprobarConsumoEnergetico(this.consumo);
    }
    
    protected void crearElectrodomestico(Double precio, Double peso, String color, String consumo) {
        setElectrodom(precio, peso, color, consumo);
        comprobarColor(this.color);
        comprobarConsumoEnergetico(this.consumo);
    }

    public void precioFinal(){
        switch (this.consumo) {
            case 'A':
                setPrecio(getPrecio()+1000d);
                break;
            case 'B':
                setPrecio(getPrecio()+800d);
                break;
            case 'C':
                setPrecio(getPrecio()+600d);
                break;
            case 'D':
                setPrecio(getPrecio()+500d);
                break;
            case 'E':
                setPrecio(getPrecio()+300d);
                break;
            case 'F':
                setPrecio(getPrecio()+100d);
                break;
        }

        if (getPeso() >= 1 && getPeso() <= 19) {
            setPrecio(getPrecio()+100d);
        } else if (getPeso() >= 20 && getPeso() <= 49) {
            setPrecio(getPrecio()+500d);
        } else if (getPeso() >= 50 && getPeso() <= 79) {
            setPrecio(getPrecio()+800d);
        } else if (getPeso() >= 80) {
            setPrecio(getPrecio()+1000d);
        } else{
            System.out.println("\nPeso invalido\n");
        }
    }
    
    private void setElectrodom(Double precio, Double peso, String color, String consumo){
        this.setPrecio(precio);
        this.setPeso(peso);
        this.setColor(color.toUpperCase());
        this.setConsumo(consumo.toUpperCase().charAt(0));
    }
    
    private void setElectrodom(){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese PRECIO: ");
        this.setPrecio(in.nextDouble());
        System.out.println("Ingrese PESO: ");
        this.setPeso(in.nextDouble());
        System.out.println("Ingrese COLOR: ");
        this.setColor(in.next().toUpperCase());
        System.out.println("Ingrese CONSUMO (A, B, C, D, E, F): ");
        this.setConsumo(in.next().toUpperCase().charAt(0));
    }

    @Override
    public String toString() {
        return "\nPRECIO: " + this.getPrecio() + "\nPESO: " + this.getPeso() + "\nCOLOR: " + this.getColor() + "\nCONSUMO: " + this.getConsumo();
    } 
}