package guia5.ej4;

import java.util.Scanner;
import util.*;

public class Rectangulo implements calculoFormas{
    private double base, altura;
    
    public Rectangulo(){
        setAtributos();
    }
    
    private void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return this.base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    
    @Override
    public void setAtributos(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese BASE: ");
        setBase(in.nextDouble());
        System.out.println("\nIngrese ALTURA: ");
        setAltura(in.nextDouble());
    }
    @Override
    public double calcularArea(){return base*altura;}
    @Override
    public double calcularPerimetro(){return (base+altura)*2;}
}
