package guia5.ej2;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    private boolean tdt = false;
    private int resolucion;
    
    public Televisor(){
        crearTelevisor();
    }
    public Televisor(int resolucion, boolean tdt, Double precio, Double peso, String color, String consumo){
        super(precio, peso, color, consumo);
        crearTelevisor(resolucion, tdt);
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    
    protected void crearTelevisor(){
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("\nIngrese RESOLUCION: ");
        this.setResolucion(in.nextInt());
        System.out.println("\nTiene SINTONIZADOR TDT?: (0, 1)");
        choice = in.nextInt();
        if(choice == 1){
            this.setTdt(true);
        } else if(choice == 0){
            this.setTdt(false);
        }
        else{
            System.out.println("\nEntrada invalida, el valor DEFAULT es FALSE");
        }
    }
    
    protected void crearTelevisor(int resolucion, boolean tdt){
        setResolucion(resolucion);
        setTdt(tdt);
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.getResolucion()>40){
            this.setPrecio(this.getPrecio()*1.3d);
        }
        if(this.isTdt()){
            this.setPrecio(this.getPrecio()+500d);
        }
    }
    
    @Override
    public String toString() {
        return "\nPRECIO: " + this.getPrecio() + "\nPESO: " + this.getPeso() + "\nCOLOR: " + this.getColor() + "\nCONSUMO: " + this.getConsumo() + "\nRESOLUCION: " + this.getResolucion() + "\nSINTONIZADOR TDT: " + this.isTdt();
    }
}
