package guia5.ej2;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private double carga;
    
    public Lavadora(){
        crearLavadora();
    }
    
    public Lavadora(double carga, Double precio, Double peso, String color, String consumo){
        super(precio, peso, color, consumo);
        crearLavadora(carga);
    }

    public double getCarga() {
        return carga;
    }

    protected void setCarga(double carga) {
        this.carga = carga;
    }
    
    protected void crearLavadora(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nIngrese CARGA: ");
        setCarga(in.nextDouble());
    }
    
    protected void crearLavadora(double carga){
        setCarga(carga);
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.getCarga()>30){
            this.setPrecio(this.getPrecio()+500d);
        }
    }
    
    @Override
    public String toString() {
        return "\nPRECIO: " + this.getPrecio() + "\nPESO: " + this.getPeso() + "\nCOLOR: " + this.getColor() + "\nCONSUMO: " + this.getConsumo() + "\nCARGA: " + this.getCarga();
    }
}
