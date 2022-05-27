package guia5.ej4;

import java.util.Scanner;
import util.*;

public class Circulo implements calculoFormas{
    private double radio;
    
    public Circulo(){
        setAtributos();
    }
    
    private void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return this.radio;
    }
    @Override
    public void setAtributos(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese RADIO: ");
        setRadio(in.nextDouble());
    }
    @Override
    public double calcularArea(){return PI*Math.pow(radio,2);}
    @Override
    public double calcularPerimetro(){return PI*(2*radio);}
}
